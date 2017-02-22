package main.java;


/**
 * Holds all datatypes
 */
class DataTypes {

    /**
     * data types
     * INTEGER: 'in';
     * DOUBLE: 'do';
     * STRING: 'st';
     * CHAR: 'ch';
     * BOOLEAN: 'bo';
     * TRUE: 'tr';
     */
    public enum DataType {
        BOOLEAN, INTEGER, DOUBLE, STRING, CHAR, TRUE, FALSE
    }

    /**
     * Get datatype from string
     * @param type String
     * @return DataTypes
     */
    public static final DataType getEnum(String type) {

        switch (type) {
            case "in":
                return DataType.INTEGER;
            case "do":
                return DataType.DOUBLE;
            case "st":
                return DataType.STRING;
            case "ch":
                return DataType.CHAR;
            case "bo":
                return DataType.BOOLEAN;
            case "tr":
                return DataType.TRUE;
            case "fs":
                return DataType.FALSE;
            default:
                return null;
        }
    }
}

