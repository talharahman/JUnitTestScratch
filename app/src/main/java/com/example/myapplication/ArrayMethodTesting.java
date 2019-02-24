package com.example.myapplication;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
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
        return input != null && input.length < 10;
    }

    /**
     * return a String[] value
     * if the argument passed to the method has an even-numbered length, remove the String with the longest length
     * return a new String[] with the expected values
     */


    public String[] smallEvensOnly(String[] input){
        if (input == null){
            return null;
        }

        String pointer = "";
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(input));

        if(inputList.size() % 2 == 0){
            for (int i = 0; i < inputList.size(); i++) {
                if(inputList.get(i).length() > pointer.length()){
                    pointer = inputList.get(i);
                }
            }
            inputList.remove(pointer);

            String[] output = new String[inputList.size()];
            for (int i = 0; i < output.length; i++) {
                output[i] = inputList.get(i);
            }
            return output;
        }
        return input;
    }

    /**
     * return a char[] value
     * return a new char[] with the expected values
     */

    public char[] sortAlphabetically(char[] input){
        if (input != null) Arrays.sort(input);
        return input;
    }

    /**
     * return a double value
     * return the sum of all the decimal numbers in the input array
     */

    public double returnSum(double[] input){
        double result = 0;
        if (input.length > 0) {
            for (double a: input) {
                result += a;
            }
        }
        return result;
    }


    /**
     * return a Set value
     * return a set of only unique items in the input array
     * if at least one version of the string from the array exists in the set
     * (uppercase, lowercase, proper case, camel case, etc.), it is not unique, please don't add it to the set
     */

  //  public Set removeCaseSensitiveDuplicates(String[] input){}

    /**
     * return a Map value
     * return the Map containing every element of the array as the key,
     * and the number of times it occurs in the array as its value
     */

  //  public Map mapDuplicates(String[] input){}



}
