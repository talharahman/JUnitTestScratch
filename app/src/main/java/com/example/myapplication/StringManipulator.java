package com.example.myapplication;

import android.support.annotation.NonNull;

public class StringManipulator {

    private static StringManipulator thisInstance;

    private StringManipulator(){}

    public static StringManipulator getInstance(){
        if (thisInstance == null) {
            thisInstance = new StringManipulator();
        }
        return thisInstance;
    }

    public static void main(String[] args) {
        System.out.println(StringManipulator.getInstance().isLessThan10(null));
    }

    public boolean isLessThan10(@NonNull String input) {
        if (input == null) {
            return false;
        }
        return input.length() < 10;
    }


}
