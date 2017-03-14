package main.java.shared.model;

import main.java.shared.DataType;

import java.util.ArrayList;

/**
 * Created by Garcia on 14/03/2017.
 */
public class Variables {
    private String id;
    private String scope;
    private DataType param;


    public Variables() {
    }

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

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
