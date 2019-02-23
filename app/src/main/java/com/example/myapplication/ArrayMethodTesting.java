package com.example.myapplication;

import java.util.Map;
import java.util.Set;

public class ArrayMethodTesting {

    private static ArrayMethodTesting thisInstance;

    private ArrayMethodTesting(){}

    public static ArrayMethodTesting getInstance(){
        if (thisInstance == null) {
            thisInstance = new ArrayMethodTesting();
        }
        return thisInstance;
    }

    /**
     * return a boolean value
     * if the argument passed to the method is less than 10 elements in length, return true, otherwise return false
     */

    public boolean isLessThan10(String[] input){

    }

    /**
     * return a String[] value
     * if the argument passed to the method has an even-numbered length, remove the String with the longest length
     * return a new String[] with the expected values
     */

    public String[] smallEvensOnly(String[] input){

    }

    /**
     * return a char[] value
     * return a new char[] with the expected values
     */

    public char[] sortAlphabetically(char[] input){

    }

    /**
     * return a double value
     * return the sum of all the decimal numbers in the input array
     */

    public double returnSum(double[] input){

    }

    /**
     * return a Set value
     * return a set of only unique items in the input array
     * if at least one version of the string from the array exists in the set
     * (uppercase, lowercase, proper case, camel case, etc.), it is not unique, please don't add it to the set
     */

    public Set removeCaseSensitiveDuplicates(String[] input){

    }

    /**
     * return a Map value
     * return the Map containing every element of the array as the key,
     * and the number of times it occurs in the array as its value
     */

    public Map mapDuplicates(String[] input){

    }

}
