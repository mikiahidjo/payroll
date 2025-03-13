package com.startup.util;

public class Helper {
    public static boolean isEmptyOrNullString(String str){
        if(str == null || str.isEmpty())
            return true;
        return false;
    }
}
