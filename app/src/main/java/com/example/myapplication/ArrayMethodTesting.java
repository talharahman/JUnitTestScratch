package com.example.myapplication;

public class ArrayMethodTesting {

    private static ArrayMethodTesting thisInstance;

    private ArrayMethodTesting(){}

    public static ArrayMethodTesting getInstance(){
        if (thisInstance == null) {
            thisInstance = new ArrayMethodTesting();
        }
        return thisInstance;
    }


}
