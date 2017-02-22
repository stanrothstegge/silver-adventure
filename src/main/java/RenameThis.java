package main.java;

/**
 * Created by Garcia on 22/02/2017.
 */
public class RenameThis {
    private String id;
    private DataTypes params;

    public RenameThis(DataTypes params) {
        this.params = params;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataTypes getParams() {
        return params;
    }

    public void setParams(DataTypes params) {
        this.params = params;
    }
}
