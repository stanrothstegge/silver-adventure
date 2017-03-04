package main.java.typechecking;

import main.java.shared.DataType;

/**
 * Object used in TypeChecker
 */
class DataTypeCarrier {
    public final DataType type;

    public DataTypeCarrier(DataType type) {
        this.type = type;
    }

}
