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
    private int biggestLocalSize = 0;
    private int localSize = 0;
    
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
            
            //figure out the stack number
            int stackNumber;
            
            //doubles need double the size
            if (type == DataType.DOUBLE) {
                stackNumber = getLocalNumber(2);
            } else {
                stackNumber = getLocalNumber(1);
            }
            
            variables.add(new Variable(name, type, stackNumber));
            return true;
        }
        return false;
    }

    /**
     * Helper method used to get the next available local number
     * @param spaceNeeded space on the stack required
     * @return local number
     */
    private int getLocalNumber(int spaceNeeded) {
        if (isGlobalScope) return 0; //see if this isn't the global scope
        
        if (!variables.isEmpty()) { //we have variables, so lets look at our own scope
            
            //however much stack space is needed, stack position is always 1 after the last position
            int localPosition = localSize + 1;
            
            localSize += spaceNeeded;
            
            if (biggestLocalSize < localSize) { //if biggestLocalSize is smaller than localSize, we need to update
                biggestLocalSize = localSize;
            }
            
            return localPosition;
        } else { //the get the stack number from the parentscope
            localSize = parentScope.getLocalNumber(spaceNeeded);
            
            if (biggestLocalSize < localSize) { //if biggestLocalSize is smaller than localSize, we need to update
                biggestLocalSize = localSize;
            }
            
            return localSize;
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
        if (parentScope.isGlobalScope) { //is globalscope, so add scope size to the hashmap of the globalscope
            
            parentScope.scopeSizes.put(name, biggestLocalSize);
            
        } else { //overwrite biggestscope of parent if yours is bigger
            
            if (parentScope.biggestLocalSize < biggestLocalSize) {
                parentScope.biggestLocalSize = biggestLocalSize;
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
