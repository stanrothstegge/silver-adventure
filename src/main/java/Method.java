package main.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Robin on 22-2-2017.
 */
public class Method {
    public final ArrayList<DataTypes.DataType> returnValues = new ArrayList<>();
    public final ArrayList<DataTypes.DataType> parameters = new ArrayList<>();

    public Method(DataTypes.DataType[] returnValues, DataTypes.DataType[] parameters) {
        this.returnValues.addAll(Arrays.asList(returnValues));

        this.parameters.addAll(Arrays.asList(parameters));
    }
}
