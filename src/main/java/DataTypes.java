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


    public static void typeChecker(Integer x, DataType dataType) throws RuntimeException {
        if(dataType != DataType.INTEGER)
            throw new RuntimeException("Variable =" + x + " Is not Integer but:" + dataType);
    }
    public static void typeChecker(Double x, DataType dataType) throws RuntimeException{
        if(dataType != DataType.DOUBLE)
            throw new RuntimeException("Variable =" + x + " Is not DOUBLE but:" + dataType);
    }

    public static void typeChecker(String x, DataType dataType) throws RuntimeException{
        if(dataType != DataType.STRING)
            throw new RuntimeException("Variable =" + x + " Is not STRING but:" + dataType);
    }

    public static void typeChecker(Character x, DataType dataType) throws RuntimeException{
        if(dataType != DataType.CHAR)
            throw new RuntimeException("Variable =" + x + " Is not CHAR but:" + dataType);
    }

    public static void typeChecker(Boolean x, DataType dataType) throws RuntimeException{
        if(dataType != DataType.BOOLEAN)
            throw new RuntimeException("Variable =" + x + " Is not BOOLEAN but:" + dataType);
    }

}

