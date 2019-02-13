package com.example.myapplication;

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
        System.out.println(StringManipulator.getInstance().deConstructedWord(null));
        System.out.println(StringManipulator.getInstance().wordSum("hello", null));
        System.out.println(StringManipulator.getInstance().longestWord(new String[]{"hello", "world", null, "aliens"}));
        System.out.println(Arrays.toString(StringManipulator.getInstance().wordSort(new String[]{"hello", "world", "of", "aliens"})));
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

    public int wordSum(String first, String second) {
        if (first != null && second != null) {
            return first.length() + second.length();
        } else {
            return 0;
        }
    }

    public String longestWord(String[] input){
        String longest = "";
        for (int i = 0; i < input.length; i++) {
            if(input[i] == null){
                continue;
            }
            if(input[i].length() > longest.length()){
                longest = input[i];
            }
        }
        return longest;
    }

    public String[] wordSort(String[] words){
        // use bubble sort
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                continue;
            }
            for (int m = i + 1; m < words.length; m++) {
                if (words[m] == null) {
                    continue;
                }
                if (words[i].length() > words[m].length()){
                    String temp = words[m];
                    words[m] = words[i];
                    words[i] = temp;
                }
            }
        }
        return words;
    }

}
