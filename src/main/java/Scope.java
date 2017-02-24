package main.java;

import javax.xml.crypto.Data;
import java.util.HashMap;

/**
 * Created by Robin on 22-2-2017.
 */
class Scope {

    final Scope parentScope;
    private final HashMap<String, DataTypes.DataType> variables = new HashMap<>();
    private final HashMap<String, Method> methods;
    
    private Scope(Scope parentScope) {
        this.parentScope = parentScope;
        //can't add methods outside of global scope
        methods = null;
    }

    public Scope() {
        parentScope = null;
        methods = new HashMap<>();
    }
    
    public boolean declareVariable(String name, DataTypes.DataType type) {
        if (!variables.containsKey(name)) {
            variables.put(name, type);
            return true;
        }
        return false;
    }
    
    public boolean declareMethod(String name, Method method) {
        Scope globalscope = getGlobalScope();
        if (!globalscope.methods.containsKey(name)) {
            globalscope.methods.put(name, method);
            return true;
        }
        return false;
    }
    
    public DataTypes.DataType lookupVariable(String name) {
        DataTypes.DataType type = variables.get(name);
        if (type == null && parentScope != null) {
            type = parentScope.lookupVariable(name);
        }
        return type;
    }

    public DataTypes.DataType lookupGlobalVariable(String name) {
        return getGlobalScope().lookupVariable(name);
    }
    
    public Method lookupMethod(String name) {        
        return getGlobalScope().methods.get(name);
    }
    
    private Scope getGlobalScope() {
        Scope scope = this;
        while(scope.parentScope != null) {
            scope = scope.parentScope;
        }
        return scope;
    }
    
    public Scope open() {
        return new Scope(this);
    }
    
    public Scope close() {
        return parentScope;
    }
}
