package com.example.myapplication;

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
        int[] arr = new int[]{baseNumber, baseNumber * range -1, baseNumber * range - 2}

        return arr;
    }
}
