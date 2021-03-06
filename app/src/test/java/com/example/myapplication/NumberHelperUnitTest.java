package com.example.myapplication;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

public class NumberHelperUnitTest {

    private NumberHelper numberHelper;

    @Before
    public void setup() throws Exception{
        numberHelper = NumberHelper.getInstance();
    }

    @Test
    public void check_for_odd(){
        int testnum = 5;
        Assert.assertEquals("odd", numberHelper.oddOrEven(testnum));
    }

    @Test
    public void check_for_even(){
        int testnum = 6;
        Assert.assertEquals("even", numberHelper.oddOrEven(testnum));
    }

    @Test
    public void div_by_5_check(){
        Assert.assertTrue(numberHelper.divisibleBy5(15));
    }

    @Test
    public void div_by_not_5_check(){
        Assert.assertFalse(numberHelper.divisibleBy5(11));
    }

    @Test
    public void mult_of_n_test(){
        int base = 3;
        int range = 5;
        int[] actual = numberHelper.multiplesOfN(base, range);
        int[] expected = new int[]{3,6,9,12,15};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void string_num_test(){
        int expected = 5;
        String test = "5";
        Assert.assertEquals(expected, numberHelper.stringToNumber(test));
    }

    @Test
    public void string_not_num(){
        String num = "five";
        int result = numberHelper.stringToNumber(num);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void array_sum_test(){
        int[] args = {1,2,3};
        int expected = 6;
        Assert.assertEquals(expected, numberHelper.arraySum(args));
    }

    @Test
    public void array_sum_test_neg(){
        int[] args = {1,-1,3, -5, 0};
        int expected = -2;
        Assert.assertEquals(expected, numberHelper.arraySum(args));
    }

    @Test
    public void check_largest_number(){
        int[] args = {1, 3, 7, 5};
        int expected = 7;
        Assert.assertEquals(expected, numberHelper.largestNumber(args));
    }

    @Test
    public void check_largest_if_negative(){
        int[] args = {1, 3, -7, 7};
        int expected = 7;
        Assert.assertEquals(expected, numberHelper.largestNumber(args));
    }

    @Test
    public void number_sort_test(){
        int[] args = {3, 6, 4, 1, 9};
        int[] expected = {1, 3, 4, 6, 9};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(numberHelper.numberSort(args)));
    }

    @After
    public void teardown(){
        numberHelper = null;
    }

}
