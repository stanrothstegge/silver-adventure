package main.java;

/**
 * Created by Garcia on 22/02/2017.
 */
public class RenameThis {
    private String id;
    private DataTypes.DataType params;

    public RenameThis(DataTypes.DataType params) {
        this.params = params;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataTypes.DataType getParams() {
        return params;
    }

    public void setParams(DataTypes.DataType params) {
        this.params = params;
    }
}
