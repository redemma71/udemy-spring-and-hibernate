package com.chadcover.springdemo.mvc;

public class UtilityMethods {
    public static String castToTitleCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
