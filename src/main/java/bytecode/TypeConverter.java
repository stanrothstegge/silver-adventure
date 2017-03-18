package main.java.bytecode;

import main.java.shared.DataType;
import main.java.shared.DataTypes;

import java.util.Date;

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
     * //todo ALLE THIS
     * @param type
     * @param value
     * @param kind
     * @return
     */
    static String generateCommand(DataType type, String value, Command kind) {
        switch (type) {
            case BOOLEAN:
                return kind == Command.PUT ? "bastore " + value : "baload ";
            case INTEGER:
                return kind == Command.PUT ? "bipush " + value : "istore ";
            case DOUBLE:
                return kind == Command.PUT ? "dastore " + value : "daload "; // takes 2 spaces
            case STRING:
                return kind == Command.PUT ? "ldc " + value : "aload "; //todo not sure if works
            case CHAR:
                return kind == Command.PUT ? "castore " + value : "caload ";
            default:
                throw new RuntimeException("stuff wnet wrong");
        }
    }
}
