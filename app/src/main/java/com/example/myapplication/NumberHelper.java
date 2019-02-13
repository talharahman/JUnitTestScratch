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
        System.out.println(NumberHelper.getInstance().oddOrEven(4));
    }

    /**
     * This method should:
     * return a String value
     * if the argument passed to the method is an even number, return even, otherwise return odd
     */

    public String oddOrEven(int input){
        if (input % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }


}
