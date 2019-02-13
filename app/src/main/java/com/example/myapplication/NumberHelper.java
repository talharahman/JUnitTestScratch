package com.example.myapplication;

import android.support.annotation.IntRange;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberHelper {

    private static NumberHelper thisInstance;

    private NumberHelper(){}

    public static NumberHelper getInstance(){
        if (thisInstance == null) {
            thisInstance = new NumberHelper();
        }
        return thisInstance;
    }

    public static void main(String[] args) {
        System.out.println(NumberHelper.getInstance().oddOrEven(0));
        System.out.println(NumberHelper.getInstance().divisibleBy5(11));
        System.out.println(Arrays.toString(NumberHelper.getInstance().multiplesOfN(3, 5)));
        System.out.println(NumberHelper.getInstance().stringToNumber("5"));
        System.out.println(NumberHelper.getInstance().arraySum(new int[]{-5,2,-4}));


    }

    /**
     * return a String value
     * if the argument passed to the method is an even number, return even, otherwise return odd
     */

    public String oddOrEven(int input){
        if (input % 2 == 0) {
            return "even";
        }   return "odd";
    }

    /**
     * return a boolean value
     * if the argument passed to the method is divisible by the number 5, return true, otherwise return false
     */

    public boolean divisibleBy5(int input){
        return input % 5 == 0;
    }

    /**
     * return an int[] that consists of the multiples of the base number, up to the number given in the range value,
     * i.e. if the number in the baseNumber parameter is 3, and the range is 10, then the output should be:
     * int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30}
     */

    public int[] multiplesOfN(int baseNumber, int range){
        if (range < 0) {
            throw new IllegalArgumentException("Range cannot be negative");
        }
        int[] arr = new int[range];
        for (int i = 0; i < range; i++) {
            arr[i] = baseNumber * (i + 1);
        }
        return arr;
    }

    /**
     * return an int value
     * return an int that grabs the int value from a String, i.e. - stringToNumber("5") should return 5
     */

    public int stringToNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * return an int value
     * return the value of the sum of all the elements in the array combined
     */

    public int arraySum(int[] numbers){
        int sum = 0;
        for (Integer i: numbers){
            sum += i;
        }
        return sum;
    }


}


