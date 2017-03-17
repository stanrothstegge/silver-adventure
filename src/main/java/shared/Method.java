package main.java.shared;

import java.util.ArrayList;

/**
 * //todo robintext hier
 */
public class Method {
    public final String name;
    private ArrayList<DataType> returnValues = new ArrayList<>();
    private ArrayList<DataType> parameters = new ArrayList<>();

    public Method(String name) {
        this.name = name;
    }

    public void addReturnValue(DataType type) {
        returnValues.add(type);
    }

    public void addParameter(DataType type) {
        parameters.add(type);
    }
}
