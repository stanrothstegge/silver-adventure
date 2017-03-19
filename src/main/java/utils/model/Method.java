package main.java.utils.model;

import main.java.utils.DataType;

import java.util.ArrayList;

/**
 * //todo robintext hier
 */
public class Method {
    public final String name;
    private ArrayList<DataType> returnValues = new ArrayList<>();
    private ArrayList<DataType> parameters = new ArrayList<>();
    private int amount;

    public Method(String name) {
        this.name = name;
    }

    public void addReturnValue(DataType type) {
        returnValues.add(type);
    }

    public Method setReturnValues(ArrayList<DataType> returnValues) {
        this.returnValues = returnValues;
        return this;
    }

    public void addParameter(DataType type) {
        parameters.add(type);
    }

    public void setParameters(ArrayList<DataType> parameters) {
        this.parameters = parameters;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public DataType getReturnType(int select) {
        return returnValues.get(select);
    }

    public ArrayList<DataType> getReturn(){
        return returnValues;
    }

    public DataType getParameters(int i) {
        return parameters.get(i);
    }
}
