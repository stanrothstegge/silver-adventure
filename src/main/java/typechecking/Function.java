package main.java.typechecking;

import main.java.shared.DataType;
import main.java.shared.DataTypes;

import java.util.ArrayList;

/**
 * Created by Garcia on 22/02/2017.
 */
public class Function {
    private String id;
    private DataType param;
    private ArrayList<DataType> returnType;
    private ArrayList<DataType> argumentTypes;

    public Function() {}

    public Function(DataType params) {
        this.param = params;
    }

    public Function(ArrayList<DataType> returnType) {
        this.returnType = returnType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataType getParams() {
        return param;
    }

    public void setParams(DataType params) {
        this.param = params;
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
}
