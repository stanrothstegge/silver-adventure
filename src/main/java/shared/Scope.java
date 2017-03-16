package main.java.shared;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * //todo robin text hier
 */
public class Scope {

    private final Scope parentScope;
    private ArrayList<Scope> childScope = new ArrayList<>();
    
    private final ArrayList<Variable> variables = new ArrayList<>();
    private final HashMap<String, Method> methods;
    private final String name;

    private Scope(Scope parentScope, String name) {
        this.parentScope = parentScope;
        this.name = name;
        //can't add methods outside of global scope
        methods = null;
    }

    public Scope() {
        parentScope = null;
        name = null;
        methods = new HashMap<>();
    }

    public boolean declareVariable(String name, DataType type) {
        if (lookupVariable(name) == null) {
            //todo: setup local number
            int localNumber = -1;
            variables.add(new Variable(name, type, localNumber));
            return true;
        }
        return false;
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
    
    private Variable getVariable(String name) {
        for(Variable v: variables) {
            if (v.name.equals(name)) {
                return v;
            }
        }
        return null;
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
        childScope.add(new Scope(this, name));
        return childScope.get(childScope.size() - 1);
    }
    
    public Scope open() {
        return open(null);
    }

    public Scope close() {
        return parentScope;
    }

    public ArrayList<Scope> getChildScope() {
        return childScope;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public String getName() {
        return name;
    }
}
