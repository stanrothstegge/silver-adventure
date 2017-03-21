package main.java.bytecode;

import main.java.utils.DataType;
import main.java.utils.DataTypes;

/**
 * Created by Robin on 11-3-2017.
 */
public class TypeConverter {

    static String convert(DataType type, boolean big) {
        //   BOOLEAN, INTEGER, DOUBLE, STRING, CHAR, TRUE, FALSE, VOID
        switch (type) {
            case BOOLEAN:
                if (big) {
                    return "Z";
                } else {
                    return "i";
                }
            case INTEGER:
                if (big) {
                    return "I";
                } else {
                    return "i";
                }
            case DOUBLE:
                if (big) {
                    return "D";
                } else {
                    return "d";
                }
            case STRING:
                if (big) {
                    return "Ljava/lang/String;";
                } else {
                    return "a"; //areturn
                }
            case CHAR:
                if (big) {
                    return "C";
                } else {
                    return "i";
                }
            case VOID:
                if (big) {
                    return "V";
                } else {
                    return "";
                }

            default:
                throw new RuntimeException("stuff wnet wrong");
        }
    }

    static String convert(String type, boolean big) {
        return convert(DataTypes.getEnum(type), big);
    }

    static String defaultValue(DataType type) {
        switch (type) {
            case INTEGER:
                return "0";
            default:
                return null;
        }
    }

    /**
     * //todo invullen
     * @param type
     * @param value
     * @param kind
     * @return
     */
    static String generateCommand(DataType type, String value, Command kind) {
        switch (type) {
            case BOOLEAN:
                    if (value.equals("tr")) {//true
                        value = "1";
                    } else if (value.equals("fs")) {//false
                        value = "0";
                    }
            case TRUE:
            case FALSE:
                switch (kind) {
                    case PUT:
                        return "iconst_" + value;
                    case STORE:
                        return "istore "+ value;
                    case LOAD:
                        return "iload " + value;
                    case EQUALTO:
                    case NOTEQUALTO:
                }
            case INTEGER:
                switch (kind) {
                    case PUT:
                        //smaller than 128: bipush
                        //smaller than 32768: sipush
                        //rest: ldc
                        return "ldc " + value;
                    case STORE:
                        return "istore "+ value;
                    case LOAD:
                        return "iload " + value;
                    case EQUALTO:
                    case NOTEQUALTO:
                    case GREATER:
                    case GREATEREQUAL:
                    case SMALLER:
                    case SMALLEREQUAL:
                }
            case DOUBLE:
                switch (kind) {
                    case PUT:
                        return "ldc2_w " + value;
                    case STORE:
                        return "dstore "+ value;
                    case LOAD:
                        return "dload " + value;
                    case EQUALTO:
                    case NOTEQUALTO:
                    case GREATER:
                    case GREATEREQUAL:
                    case SMALLER:
                    case SMALLEREQUAL:
                }
            case STRING:
                switch (kind) {
                    case PUT:
                        return "ldc " + value;//todo not sure if works
                    case STORE:
                        return "astore "+value;
                    case LOAD:
                        return "aload " + value;//todo not sure if works
                    case EQUALTO:
                    case NOTEQUALTO:
                }
            case CHAR:
                switch (kind) {
                    case PUT:
                        return "bipush " +  Integer.toString((int) value.replaceAll("\'", "").charAt(0));
                    case STORE:
                        return "istore "+ value;
                    case LOAD:
                        return "iload " + value;//todo fix char
                    case EQUALTO:
                    case NOTEQUALTO:
                }
            default:
                throw new RuntimeException("stuff went wrong");
        }


    }
}
