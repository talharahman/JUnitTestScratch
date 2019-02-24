package com.example.myapplication;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayMethodTestingTest {

    private ArrayMethodTesting arrayMethodTesting;

    @Before
    public void setup(){
        arrayMethodTesting = ArrayMethodTesting.getInstance();
    }

    @Test
    public void is_less_than_10_false(){
        String[] test = {"I", "love", "java", "but", "I", "like", "to", "learn", "kotlin", "as", "well"};
        boolean actual = arrayMethodTesting.isLessThan10(test);
        Assert.assertFalse(actual);
    }

    @Test
    public void is_less_than_10_true(){
        String[] test = {"I", "love", "kotlin", "more", "actually"};
        boolean actual = arrayMethodTesting.isLessThan10(test);
        Assert.assertTrue(actual);
    }

    @Test
    public void is_less_than_null(){
        String[] test = null;
        boolean actual = arrayMethodTesting.isLessThan10(test);
        Assert.assertFalse(actual);
    }

    @Test
    public void test_for_odd_length(){
        String[] expected = {"hello", "world", "said", "no", "one"};
        String[] actual = arrayMethodTesting.smallEvensOnly(expected);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void small_evens_only_test(){
        String[] input = {"hello", "world", "said", "every", "person", "ever"};
        String[] output = {"hello", "world", "said", "every", "ever"};
        Assert.assertArrayEquals(output, arrayMethodTesting.smallEvensOnly(input));
    }

    @Test
    public void small_even_test_null(){
        Assert.assertNull(arrayMethodTesting.smallEvensOnly(null));
    }

    @Test
    public void sort_alphabet_test(){
        char[] input = {'a', 'c', 'b', 'd'};
        char[] output = {'a', 'b', 'c', 'd'};
        Assert.assertArrayEquals(output, arrayMethodTesting.sortAlphabetically(input));
    }

    @Test
    public void sort_alphabet_test_numbers(){
        char[] input = {'2', '5', '3', '4'};
        char[] output = {'2', '3', '4', '5'};
        Assert.assertArrayEquals(output, arrayMethodTesting.sortAlphabetically(input));
    }

    @Test
    public void sort_alphabet_test_null(){
        Assert.assertNull(arrayMethodTesting.sortAlphabetically(null));
    }

    @Test
    public void return_sum_test(){
        double[] input = {5.0, 3.3, 1.5, 6.0, 2.7};
        double output = 18.5;
        double result = arrayMethodTesting.returnSum(input);
        Assert.assertEquals(Double.compare(output, result),0);
    }



    @After
    public void teardown(){
        arrayMethodTesting = null;
    }


}
