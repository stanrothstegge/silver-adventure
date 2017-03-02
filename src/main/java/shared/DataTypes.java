package main.java.shared;


/**
 * Holds all datatypes
 */
public class DataTypes {

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
                throw new RuntimeException("Invalid datatype :"+ type);                                                 //this should never happen
        }
    }


    public static void thatOtherTypeChecker(Integer x, DataType dataType) throws RuntimeException {
        if(dataType != DataType.INTEGER)
            if(dataType != DataType.DOUBLE)
            throw new RuntimeException("Variable =" + x + " Is not Integer but:" + dataType);
    }
    public static void thatOtherTypeChecker(Double x, DataType dataType) throws RuntimeException{
        if(dataType != DataType.DOUBLE)
            if(dataType != DataType.INTEGER)
            throw new RuntimeException("Variable =" + x + " Is not DOUBLE but:" + dataType);
    }

    public static void thatOtherTypeChecker(String x, DataType dataType) throws RuntimeException{
        if(dataType != DataType.STRING)
            throw new RuntimeException("Variable =" + x + " Is not STRING but:" + dataType);
    }

    public static void thatOtherTypeChecker(Character x, DataType dataType) throws RuntimeException{
        if(dataType != DataType.CHAR)
            throw new RuntimeException("Variable =" + x + " Is not CHAR but:" + dataType);
    }

    public static void thatOtherTypeChecker(Boolean x, DataType dataType) throws RuntimeException{
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

        switch (dataTypeFirst){
            case BOOLEAN:                                                                                               // checks booleans and true and false
            case FALSE:
            case TRUE:
                switch (dataTypeSecond){
                    case BOOLEAN:
                    case FALSE:
                    case TRUE: return;
                    default:
                        throw new RuntimeException("The = didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
                }
            case STRING:                                                                                                //Checks string and char
            case CHAR:
                switch (dataTypeSecond){
                    case STRING:
                    case CHAR: return;
                        default:
                            throw new RuntimeException("The = didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
                }
            case DOUBLE:                                                                                                //Check double and integer
            case INTEGER:
                switch (dataTypeSecond){
                    case DOUBLE:
                    case INTEGER: return;
                    default:
                        throw new RuntimeException("The = didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
                }
            default:
                throw new RuntimeException("The = didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
        }
    }

    /**
     *
     * Checks what datatype work with each other in expressions
     *
     * boolean and true and false
     * string and char
     * integer and double
     * @param dataTypeFirst
     * @param dataTypeSecond
     */
    public static void typeCheckingExpression(DataType dataTypeFirst , DataType dataTypeSecond){
        if(dataTypeFirst == dataTypeSecond) return;                                                                     //If both are the same no checking required

        switch (dataTypeFirst){
            case BOOLEAN:                                                                                               // checks booleans and true and false
            case FALSE:
            case TRUE:
                switch (dataTypeSecond){
                    case BOOLEAN:
                    case FALSE:
                    case TRUE: return;
                    default:
                        throw new RuntimeException("didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
                }
            case STRING:                                                                                                //Checks string and char
                switch (dataTypeSecond){
                    case STRING:
                    case CHAR: return;
                    default:
                        throw new RuntimeException("didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
                }
            case CHAR:
                switch (dataTypeSecond){
                    case CHAR: return;
                    default:
                        throw new RuntimeException("didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
                }
            case DOUBLE:                                                                                                //Check double and integer
            case INTEGER:
                switch (dataTypeSecond){
                    case DOUBLE:
                    case INTEGER: return;
                    default:
                        throw new RuntimeException("didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
                }
            default:
                throw new RuntimeException("didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
        }
    }

    /**
     * Check all booleans
     * @param dataTypeFirst
     * @param dataTypeSecond
     * @throws RuntimeException
     */
    public static void checkBoolean(DataType dataTypeFirst , DataType dataTypeSecond) throws RuntimeException {
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
    
    /**
     * Check all the < > >= <=
     * And + - / *
     * @param dataTypeFirst DataType
     * @param dataTypeSecond DataType
     */
    public static void typeCheckingMath(DataType dataTypeFirst , DataType dataTypeSecond) throws RuntimeException {
        switch (dataTypeFirst) {
            case DOUBLE:                                                                                                //Check double and integer
            case INTEGER:
                switch (dataTypeSecond) {
                    case DOUBLE:
                    case INTEGER:
                        return;
                    default:
                        throw new RuntimeException("Wasnt a double or integer " + dataTypeFirst + " and " +dataTypeSecond);
                }
            default:
                throw new RuntimeException("Wasnt a double or integer " + dataTypeFirst + " and " +dataTypeSecond);
        }
    }
    /**
     * Check all the < > >= <=
     * And + - / *
     * @param dataTypeFirst DataType
     * @param dataTypeSecond DataType
     */
    public static void typeCheckingMathAndString(DataType dataTypeFirst , DataType dataTypeSecond) throws RuntimeException {
        switch (dataTypeFirst) {
            case DOUBLE:                                                                                                //Check double and integer
            case INTEGER:
                switch (dataTypeSecond) {
                    case DOUBLE:
                    case INTEGER:
                        return;
                    default:
                        throw new RuntimeException("Wasnt a double or integer " + dataTypeFirst + " and " +dataTypeSecond);
                }
            case STRING:                                                                                                //Checks string and char
            case CHAR:
                switch (dataTypeSecond){
                    case STRING:
                    case CHAR: return;
                    default:
                        throw new RuntimeException("The = didnt work with " + dataTypeFirst + " and " +dataTypeSecond);
                }
            default:
                throw new RuntimeException("Wasnt a String Or Integer " + dataTypeFirst + " and " +dataTypeSecond);
        }
    }
}

