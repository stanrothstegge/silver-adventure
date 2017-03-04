package main.java.shared;


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
                throw new RuntimeException("Invalid datatype :" + type);                                                 //this should never happen
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
    public static void typeCheckingEqualToExpression(DataType dataTypeFirst, DataType dataTypeSecond) {
        if (dataTypeFirst == dataTypeSecond)
            return;                                                                                                     //If both are the same no checking required
        typeCheckingBoolean(dataTypeFirst,dataTypeSecond);
        typeCheckStringAndChar(dataTypeFirst,dataTypeSecond,true);
        typeCheckDoubleAndInteger(dataTypeFirst,dataTypeSecond);
        //bo
        //stirng type 1
        //double

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
    public static void typeCheckingExpression(DataType dataTypeFirst, DataType dataTypeSecond) {
        if (dataTypeFirst == dataTypeSecond) return;                                                                    //If both are the same no checking required
        typeCheckingBoolean(dataTypeFirst,dataTypeSecond);
        typeCheckStringAndChar(dataTypeFirst,dataTypeSecond,false);
        typeCheckDoubleAndInteger(dataTypeFirst,dataTypeSecond);


    }


    /**
     * Check all the < > >= <=
     * And + - / *
     *
     * @param dataTypeFirst  DataType
     * @param dataTypeSecond DataType
     */
    public static void typeCheckingMathAndString(DataType dataTypeFirst, DataType dataTypeSecond) throws RuntimeException {
        typeCheckDoubleAndInteger(dataTypeFirst,dataTypeSecond);
        typeCheckStringAndChar(dataTypeFirst,dataTypeSecond,true);
    }

    /**
     * Checks all integers and number combinations
     * @param dataTypeFirst
     * @param dataTypeSecond
     * @throws RuntimeException
     */
    public static void typeCheckDoubleAndInteger(DataType dataTypeFirst, DataType dataTypeSecond) throws RuntimeException {
        switch (dataTypeFirst) {
            case DOUBLE:                                                                                                //Check double and integer
            case INTEGER:
                switch (dataTypeSecond) {
                    case DOUBLE:
                    case INTEGER:
                        return;
                    default:
                        throw new RuntimeException("Wasnt a double or integer " + dataTypeFirst + " and " + dataTypeSecond);
                }
        }
    }

    /**
     * Checks all string and char combinations
     * But type == false means char can only == to char
     * @param dataTypeFirst
     * @param dataTypeSecond
     * @param type true = string and char are equal
     * @throws RuntimeException
     */
    public static void typeCheckStringAndChar(DataType dataTypeFirst, DataType dataTypeSecond, boolean type) throws RuntimeException {
        if (type) {
            switch (dataTypeFirst) {
                case STRING:                                                                                                //Checks string and char
                case CHAR:
                    switch (dataTypeSecond) {
                        case STRING:
                        case CHAR:
                            return;
                        default:
                            throw new RuntimeException("The = didnt work with " + dataTypeFirst + " and " + dataTypeSecond);
                    }
            }
        } else {
            switch (dataTypeFirst) {
                case STRING:                                                                                                //Checks string and char
                    switch (dataTypeSecond) {
                        case STRING:
                        case CHAR:
                            return;
                        default:
                            throw new RuntimeException("didnt work with " + dataTypeFirst + " and " + dataTypeSecond);
                    }
                case CHAR:
                    switch (dataTypeSecond) {
                        case CHAR:
                            return;
                        default:
                            throw new RuntimeException("didnt work with " + dataTypeFirst + " and " + dataTypeSecond);
                    }
            }
        }
    }

    /**
     * Checks all boolean combination
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
                        throw new RuntimeException("The = didnt work with " + dataTypeFirst + " and " + dataTypeSecond);
                }
        }
    }
}

