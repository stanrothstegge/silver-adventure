package main.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Robin on 22-2-2017.
 */
public class Method {
    public final ArrayList<DataType> returnValues = new ArrayList<>();
    public final ArrayList<DataType> parameters = new ArrayList<>();

    public Method(DataType[] returnValues, DataType[] parameters) {
        this.returnValues.addAll(Arrays.asList(returnValues));

        this.parameters.addAll(Arrays.asList(parameters));
    }
}
