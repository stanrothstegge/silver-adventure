package main.java.shared;

import java.util.ArrayList;

/**
 * //todo robintext hier
 */
public class Method {
    private ArrayList<DataType> returnValues = new ArrayList<>();
    private ArrayList<DataType> parameters = new ArrayList<>();

    public void addReturnValue(DataType type) {
        returnValues.add(type);
    }

    public void addParameter(DataType type) {
        parameters.add(type);
    }
}
