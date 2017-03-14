package main.java.shared.model;

import main.java.shared.DataType;

/**
 * Created by Garcia on 14/03/2017.
 */
public class Variables {
    private String id;
    private String functionName;
    private DataType param;

    public Variables(DataType params) {
        this.param = params;
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

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
