package main.java.utils;


/**
 * Holds all datatypes
 */
public class DataTypes {

    /**
     * Get datatype from string
     *
     * @param type String
     * @return DataTypes
     */
    public static DataType getEnum(String type) {

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
                throw new RuntimeException(" Invalid DataType :" + type);                                                 //this should never happen
        }
    }

    /**
     * Checks what datatype work with each other in =\
     * <p>
     * boolean and true and false
     * string and char
     * integer and double
     *
     * @param dataTypeFirst
     * @param dataTypeSecond
     */
    public static void typeCheckingEqualToExpression(DataType dataTypeFirst, DataType dataTypeSecond) throws RuntimeException {
        if (dataTypeFirst == dataTypeSecond)
            return;                                                                                                     //If both are the same no checking required
        typeCheckingBoolean(dataTypeFirst, dataTypeSecond);
        typeCheckStringAndChar(dataTypeFirst, dataTypeSecond, true);
        typeCheckDoubleAndInteger(dataTypeFirst, dataTypeSecond);
    }

    /**
     * Checks what datatype work with each other in expressions
     * <p>
     * boolean and true and false
     * string and char
     * integer and double
     *
     * @param dataTypeFirst
     * @param dataTypeSecond
     */
    public static void typeCheckingExpression(DataType dataTypeFirst, DataType dataTypeSecond) throws RuntimeException {
        if (dataTypeFirst == dataTypeSecond)
            return;                                                                    //If both are the same no checking required
        typeCheckingBoolean(dataTypeFirst, dataTypeSecond);
        typeCheckStringAndChar(dataTypeFirst, dataTypeSecond, false);
        typeCheckDoubleAndInteger(dataTypeFirst, dataTypeSecond);
    }


    /**
     * Check all the < > >= <=
     * And + - / *
     *
     * @param dataTypeFirst  DataType
     * @param dataTypeSecond DataType
     */
    public static void typeCheckingMathAndString(DataType dataTypeFirst, DataType dataTypeSecond) throws RuntimeException {
        if (dataTypeFirst == dataTypeSecond)
            return;
        typeCheckDoubleAndInteger(dataTypeFirst, dataTypeSecond);
        typeCheckStringAndChar(dataTypeFirst, dataTypeSecond, true);
    }

    /**
     * Checks all integers and number combinations
     *
     * @param dataTypeFirst
     * @param dataTypeSecond
     * @throws RuntimeException
     */
    public static void typeCheckDoubleAndInteger(DataType dataTypeFirst, DataType dataTypeSecond) throws RuntimeException {
        switch (dataTypeFirst) {
            case INTEGER:                                                                                                //Check double and integer
                switch (dataTypeSecond) {
                    case INTEGER:
                        return;
                    default:
                        throw new RuntimeException(" typeCheckDoubleAndInteger DataType 1: " + dataTypeFirst + " DataType 2: " + dataTypeSecond);
                }
            case DOUBLE:
                switch (dataTypeSecond) {
                    case DOUBLE:
                    case INTEGER:
                        return;
                    default:
                        throw new RuntimeException(" typeCheckDoubleAndInteger DataType 1: " + dataTypeFirst + " DataType 2: " + dataTypeSecond);
                }
        }
    }

    /**
     * Checks all string and char combinations
     * But type == false means char can only == to char
     *
     * @param dataTypeFirst
     * @param dataTypeSecond
     * @param type           true = string and char are equal
     * @throws RuntimeException
     */
    private static void typeCheckStringAndChar(DataType dataTypeFirst, DataType dataTypeSecond, boolean type) throws RuntimeException {
        if (type) {                                                                                                     //Type 1
            switch (dataTypeFirst) {
                case STRING:
                case CHAR:
                    switch (dataTypeSecond) {
                        case STRING:
                        case CHAR:
                            return;
                        default:
                            throw new RuntimeException(" typeCheckStringAndChar Type 1 DataType 1: " + dataTypeFirst + " DataType 2: " + dataTypeSecond);
                    }
            }
        } else {
            switch (dataTypeFirst) {                                                                                    //Type 2
                case STRING:
                    switch (dataTypeSecond) {
                        case STRING:
                        case CHAR:
                            return;
                        default:
                            throw new RuntimeException(" typeCheckStringAndChar Type 2 (String and String/char) DataType 1: " + dataTypeFirst + " DataType 2: " + dataTypeSecond);
                    }
                case CHAR:
                    switch (dataTypeSecond) {
                        case CHAR:
                            return;
                        default:
                            throw new RuntimeException(" typeCheckStringAndChar Type 2 (char and char) DataType 1: " + dataTypeFirst + " DataType 2: " + dataTypeSecond);
                    }
            }
        }
    }

    /**
     * Checks all boolean combination
     *
     * @param dataTypeFirst
     * @param dataTypeSecond
     * @throws RuntimeException
     */
    public static void typeCheckingBoolean(DataType dataTypeFirst, DataType dataTypeSecond) throws RuntimeException {
        switch (dataTypeFirst) {
            case BOOLEAN:                                                                                               // checks booleans and true and false
            case FALSE:
            case TRUE:
                switch (dataTypeSecond) {
                    case BOOLEAN:
                    case FALSE:
                    case TRUE:
                        return;
                    default:
                        throw new RuntimeException(" typeCheckingBoolean DataType 1: " + dataTypeFirst + " DataType 2: " + dataTypeSecond);
                }
        }
    }
}

