package main.java.shared.model;

import main.java.shared.DataType;

import java.util.ArrayList;

/**
 * Created by Garcia on 14/03/2017.
 */
public class Function {
    private ArrayList<DataType> returnType;
    private ArrayList<DataType> argumentTypes;

    public Function() {
    }

    public Function(ArrayList<DataType> returnType) {
        this.returnType = returnType;
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
