package main.java;

import java.util.ArrayList;

/**
 * Created by Garcia on 22/02/2017.
 */
public class Function {
    private String id;
    private DataTypes.DataType param;
    private ArrayList<DataTypes.DataType> returnType;

    public Function(DataTypes.DataType params) {
        this.param = params;
    }

    public Function(ArrayList<DataTypes.DataType> returnType) {
        this.returnType = returnType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataTypes.DataType getParams() {
        return param;
    }

    public void setParams(DataTypes.DataType params) {
        this.param = params;
    }

    public DataTypes.DataType getReturnType(int select) {
        return returnType.get(select);
    }


}
