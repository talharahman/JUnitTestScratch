package com.example.myapplication;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println(StringManipulator.getInstance().isOddLength(null));
        System.out.println(StringManipulator.getInstance().zipperWords("hello",null));
        System.out.println(StringManipulator.getInstance().deConstructedWord("goodbye"));
    }

    public boolean isLessThan10(String input) {
        if (input == null) {
            return false;
        }
        return input.length() < 10;
    }

    public boolean isOddLength(String input){
        if (input == null) {
            return false;
        }
        return  input.length() % 2 != 0;
    }

    public String zipperWords(String first, String second) {
        if(first == null || second == null){
            return "";
        }

       String shorter;
       String longer;
       String temp = "";

       if (first.length() >= second.length()) {
           longer = first;
           shorter = second;
       } else {
           shorter = first;
           longer = second;
       }

        for (int i = 0; i < shorter.length(); i++) {
            temp += first.charAt(i);
            temp += second.charAt(i);

        }

        temp += longer.substring(shorter.length());
        return temp;
    }

    public String deConstructedWord(String word){
        if(word == null){
            return "";
        }

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        List<Character> v = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < word.length(); i++) {
            if (v.contains(word.charAt(i))) {
                vowels.append(word.charAt(i));
            } else {
                consonants.append(word.charAt(i));
            }
        }
        return consonants + " " + vowels;
    }


}
