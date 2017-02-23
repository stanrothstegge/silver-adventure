package main.java;

import javax.xml.crypto.Data;
import java.util.HashMap;

/**
 * Created by Robin on 22-2-2017.
 */
public class Scope {

    final Scope parentScope;
    private final HashMap<String, DataType> variables = new HashMap<>();
    private final HashMap<String, Method> methods = new HashMap<>();
    
    private Scope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public Scope() {
        parentScope = null;
    }
    
    public boolean declareVariable(String name, DataType type) {
        if (!variables.containsKey(name)) {
            variables.put(name, type);
            return true;
        }
        return false;
    }
    
    public boolean declareMethod(String name, Method method) {
        if (!methods.containsKey(name)) {
            methods.put(name, method);
            return true;
        }
        return false;
    }
    
    public DataType lookupVariable(String name) {
        DataType type = variables.get(name);
        if (type == null && parentScope != null) {
            type = parentScope.lookupVariable(name);
        }
        return type;
    }
    
    public Method lookupMethods(String name) {
        Method method = methods.get(name);
        if (method == null && parentScope != null) {
            method = parentScope.lookupMethods(name);
        }
        return method;
    }
    
    public Scope open() {
        return new Scope(this);
    }
    
    public Scope close() {
        return parentScope;
    }
}
