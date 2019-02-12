package com.example.myapplication;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringManipulatorUnitTest {

    private StringManipulator stringManipulator;

    @Before
    public void setUp() throws Exception{
        stringManipulator = StringManipulator.getInstance();
    }

    @Test
    public void is_less_than_10_Test(){
        String testString = "Hello Wor";
        Assert.assertTrue(StringManipulator.getInstance().isLessThan10(testString));
    }


    @Test
    public void is_less_than_10_test_null(){
        Assert.assertFalse(StringManipulator.getInstance().isLessThan10( null));
    }

    @Test
    public void is_odd_test(){
        String testString = "Hello";
        Assert.assertTrue(StringManipulator.getInstance().isOddLength(testString));
    }

    @Test
    public void is_odd_test_null(){
        Assert.assertFalse(StringManipulator.getInstance().isOddLength(null));
    }

    @Test
    public void zipper_words_test_same_size(){
        String first = "hello";
        String second = "world";
        String result = "hweolrllod";
        Assert.assertEquals(result, StringManipulator.getInstance().zipperWords(first, second));
    }

    @Test
    public void zipper_words_test_null(){
       String result = "";
       Assert.assertEquals(result, StringManipulator.getInstance().zipperWords("hello", null));
    }

    @Test
    public void decnstructed_word_test(){
        String testString = "hello";
        String result = "hll eo";
        Assert.assertEquals(result, StringManipulator.getInstance().deConstructedWord(testString));
    }

    @Test
    public void deconstructed_word_test_null(){
        String result = "";
        Assert.assertEquals(result, StringManipulator.getInstance().deConstructedWord(null));
    }

    @Test
    public void word_sum_test(){
        int result = 10;
        Assert.assertEquals(result, StringManipulator.getInstance().wordSum("Hello", "World"));
    }

    @Test
    public void word_sum_test_null(){
        int result = 0;
        Assert.assertEquals(result, StringManipulator.getInstance().wordSum("Hello", null));
    }

    @Test
    public void longest_word_test(){
        String[] input = {"hello", "world", "of", "aliens"};
        String expected = "aliens";
        Assert.assertEquals(expected, StringManipulator.getInstance().longestWord(input));
    }

    @Test
    public void longest_word_test_null(){
        String expected = "aliens";
        Assert.assertEquals(expected, StringManipulator.getInstance().longestWord(new String[]{"hello", null, "aliens"}));
    }

    @Test
    public void word_sort_test(){
        String[] testing = {"hello", "world", "of", "aliens"};
        String[] expected = {"of", "world", "hello", "aliens"};
        // not sure why its crossed out
        Assert.assertEquals(expected, StringManipulator.getInstance().wordSort(testing));
    }

    @Test
    public void word_sort_test_null(){
        String[] testing = {"hello", null, "of", "aliens"};
        String[] expected = {"of", null, "hello", "aliens"};
        Assert.assertEquals(expected, StringManipulator.getInstance().wordSort(testing));
    }

    @After
    public void tearDown() throws Exception{
        stringManipulator = null;
    }
}
