package main.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Robin on 22-2-2017.
 */
public class Method {
    private ArrayList<DataTypes.DataType> returnValues = new ArrayList<>();
    private ArrayList<DataTypes.DataType> parameters = new ArrayList<>();

    public void addReturnValue(DataTypes.DataType type) {
        returnValues.add(type);
    }

    public void addParameter(DataTypes.DataType type) {
        parameters.add(type);
    }
}
