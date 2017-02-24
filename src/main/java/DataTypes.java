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

    /**
     *
     * Checks what datatype work with each other in =\
     *
     * boolean and true and false
     * string and char
     * integer and double
     * @param dataTypeFirst
     * @param dataTypeSecond
     */
    public static void typeCheckingEqualToExpression(DataType dataTypeFirst , DataType dataTypeSecond){
        if(dataTypeFirst == dataTypeSecond) return;                                                                     //If both are the same no checking required

        if((DataType.BOOLEAN == dataTypeFirst || DataType.BOOLEAN == dataTypeSecond) || ( DataType.TRUE == dataTypeFirst ||
                DataType.TRUE == dataTypeSecond || DataType.FALSE == dataTypeFirst
                || DataType.FALSE == dataTypeSecond )) return;                                                          // checks booleans and true and false

        if(DataType.STRING == dataTypeFirst || DataType.STRING == dataTypeSecond || DataType.CHAR == dataTypeFirst ||
                DataType.CHAR == dataTypeSecond) return;                                                                //Checks string and char

        if(DataType.INTEGER == dataTypeFirst || DataType.INTEGER == dataTypeSecond || DataType.DOUBLE == dataTypeFirst ||
                DataType.DOUBLE == dataTypeSecond) return;                                                              //Checks integers and double

        throw new RuntimeException("The = didnt work with " + dataTypeFirst + " and " +dataTypeSecond);

    }

    /**
     * Check all the < > >= <=
     * And + - / *
     * @param dataTypeFirst DataType
     * @param dataTypeSecond DataType
     */
    public static void typeCheckingMath(DataType dataTypeFirst , DataType dataTypeSecond) throws RuntimeException {
        if(DataType.INTEGER == dataTypeFirst || DataType.INTEGER == dataTypeFirst || DataType.DOUBLE == dataTypeSecond || DataType.DOUBLE == dataTypeSecond) return;
        throw new RuntimeException("Wasnt a double or integer " + dataTypeFirst + " and " +dataTypeSecond);
    }
}

