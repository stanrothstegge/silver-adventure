package main.java.utils.model;

import main.java.utils.DataType;

/**
 * Created by Robin on 16-3-2017.
 */
public class Variable {
    public final String name;
    public final DataType type;
    public final int localNumber;

    public Variable(String name, DataType type, int localNumber) {
        this.name = name;
        this.type = type;
        this.localNumber = localNumber;
    }
}
