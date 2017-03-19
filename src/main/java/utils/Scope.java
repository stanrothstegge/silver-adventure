package main.java.utils;

import main.java.utils.model.Method;
import main.java.utils.model.Variable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * //todo robin text hier
 */
public class Scope {
    
    private final boolean isGlobalScope;

    private final Scope parentScope;
    
    private final HashMap<String, Integer> scopeSizes;
    private int biggestScope = 0;
    
    private final ArrayList<Variable> variables = new ArrayList<>();
    private final HashMap<String, Method> methods;
    private final String name;

    private Scope(Scope parentScope, String name) {
        this.parentScope = parentScope;
        this.name = name;
        //can't add methods outside of global scope
        methods = null;
        isGlobalScope = false;
        scopeSizes = null;
    }

    public Scope() {
        parentScope = null;
        name = null;
        methods = new HashMap<>();
        scopeSizes = new HashMap<>();
        isGlobalScope = true;
    }

    public boolean declareVariable(String name, DataType type) {
        if (lookupVariable(name) == null) {
            
            //figure out the local number
            int localNumber = getLocalNumber();
            
            variables.add(new Variable(name, type, localNumber));
            return true;
        }
        return false;
    }

    /**
     * Helper method used to get the next available local number
     * @return local number
     */
    private int getLocalNumber() {
        if (isGlobalScope) return 0;
        
        if (!variables.isEmpty()) { //see if this isn't the global scope
            return variables.get(variables.size() - 1).localNumber + 1;
        } else { //the parentscope is the globalscope, it's the first variable.
            return parentScope.getLocalNumber();
        }
    }

    public boolean declareMethod(Method method) {
        Scope globalscope = getGlobalScope();
        if (!globalscope.methods.containsKey(method.name)) {
            globalscope.methods.put(method.name, method);
            return true;
        }
        return false;
    }

    public DataType lookupVariable(String name) {        
        Variable type = getVariable(name);
        if (type == null && parentScope != null) {
            return parentScope.lookupVariable(name);
        } else if (type != null) {
            return type.type;
        }
        return null;
    }
    
    public Variable getVariable(String name) {
        for(Variable v: variables) {
            if (v.name.equals(name)) {
                return v;
            }
        }
        return null;
    }
    
    public int getScopeSize(String functionName) {
        if (parentScope != null) {
            throw new RuntimeException("you shouldn't be looking at this outside a global scope");
        }
        
        return scopeSizes.get(functionName);
    }

    public Method lookupMethod(String name) {
        return getGlobalScope().methods.get(name);
    }

    private ArrayList<String> seenMethods = new ArrayList<>();

    public void seenMethod(String name) {
        getGlobalScope().seenMethods.add(name);
    }

    public ArrayList<String> seenMethodsExist() {
        ArrayList<String> seenMethodsExist = new ArrayList<>();
        seenMethodsExist.addAll(getGlobalScope().seenMethods);

        for (String s : getGlobalScope().seenMethods) {
            if (getGlobalScope().methods.get(s) != null) {
                seenMethodsExist.remove(s);
            }
        }
        return seenMethodsExist;
    }

    private Scope getGlobalScope() {
        Scope scope = this;
        while (scope.parentScope != null) {
            scope = scope.parentScope;
        }
        return scope;
    }
    
    private Scope getFunctionScope() {
        Scope scope = this;
        while (name == null) {
            scope = scope.parentScope;
        }
        return scope;
    }

    public Scope open(String name) {
        return new Scope(this, name);
    }
    
    public Scope open() {
        return open(null);
    }

    public Scope close() {
        //managing storage of scope sizes
        //if this is functionscope
        if (parentScope.isGlobalScope) { //add scope size to the hashmap of the globalscope
            if (!variables.isEmpty() && biggestScope < variables.get(variables.size() - 1).localNumber) {
                biggestScope = variables.get(variables.size() - 1).localNumber;
            }
            parentScope.scopeSizes.put(name, biggestScope);
        } else { //overwrite biggestscope of parent if yours is bigger
            if (!variables.isEmpty() && parentScope.biggestScope > variables.get(variables.size() - 1).localNumber) {
                parentScope.biggestScope = variables.get(variables.size() - 1).localNumber;
            }
        }
        
        return parentScope;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public String getName() {
        return name;
    }
}
