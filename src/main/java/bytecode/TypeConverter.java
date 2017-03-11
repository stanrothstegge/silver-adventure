package main.java.bytecode;

import main.java.shared.DataType;

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
                default: return null;
        }
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
