package main.java.bytecode;

import main.java.shared.DataType;
import main.java.shared.DataTypes;

/**
 * Created by Robin on 11-3-2017.
 */
public class TypeConverter {
    
    static String convert(DataType type, boolean big) {
        switch (type) {
            case INTEGER:
                if (big) {
                    return "I";
                } else {
                    return "i";
                }
            case VOID:
                if (big) {
                    return "V";
                } else {
                    return "";
                }
            
            default: return null;
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
}
