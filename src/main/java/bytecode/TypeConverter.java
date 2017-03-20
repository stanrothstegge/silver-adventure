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
                    return "c";
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
                    value = value.equals("tr") ? "1" : "0"; //convert boolean to 1 or 0
            case TRUE:
            case FALSE:
                switch (kind) {
                    case PUT:
                        return "iconst_" + value;
                    case LOAD:
                        return "iload " + value;
                    case EQUALTO:
                    case NOTEQUALTO:
                }
            case INTEGER:
                switch (kind) {
                    case PUT:
                        return "bipush " + value;
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
                    case LOAD:
                        return "aload " + value;//todo not sure if works
                    case EQUALTO:
                    case NOTEQUALTO:
                }
            case CHAR:
                switch (kind) {
                    case PUT:
                        return "castore " + value;//todo fix char
                    case LOAD:
                        return "caload " + value;//todo fix char
                    case EQUALTO:
                    case NOTEQUALTO:
                }
            default:
                throw new RuntimeException("stuff went wrong");
        }
    }
}
