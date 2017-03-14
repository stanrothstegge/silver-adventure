package main.java.typechecking;

import main.java.shared.DataType;

import java.util.ArrayList;

/**
 * Used to hold the functions
 */
public class Function {
    private String id;
    private String scope;
    private DataType param;
    private ArrayList<DataType> returnType;
    private ArrayList<DataType> argumentTypes;

    public Function() {
    }

    public Function(DataType params) {
        this.param = params;
    }

    public Function(ArrayList<DataType> returnType) {
        this.returnType = returnType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataType getParams() {
        return param;
    }

    public void setParam(DataType param) {
        this.param = param;
    }

    public DataType getReturnType(int select) {
        return returnType.get(select);
    }

    public void setArgumentTypes(ArrayList<DataType> argumentTypes) {
        this.argumentTypes = argumentTypes;
    }

    public DataType getArgument(int i) {
        return argumentTypes.get(i);
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
