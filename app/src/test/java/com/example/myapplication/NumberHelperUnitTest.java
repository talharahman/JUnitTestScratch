package com.example.myapplication;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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
        Assert.assertEquals("odd", NumberHelper.getInstance().oddOrEven(testnum));
    }

    @Test
    public void check_for_even(){
        int testnum = 6;
        Assert.assertEquals("even", NumberHelper.getInstance().oddOrEven(testnum));
    }

    @Test
    public void div_by_5_check(){
        Assert.assertTrue(NumberHelper.getInstance().divisibleBy5(15));
    }

    @Test
    public void div_by_not_5_check(){
        Assert.assertFalse(NumberHelper.getInstance().divisibleBy5(11));
    }

    @Test
    public void mult_of_n_test(){
        int base = 3;
        int range = 5;
        int[] expected = new int[]{3,6,9,12,15};
        Assert.assertArrayEquals(expected, NumberHelper.getInstance().multiplesOfN(base, range));
    }

    @Test (expected = IllegalArgumentException.class)
    public void mult_of_n_if_neg_range(){
        int base = 3;
        int range = -2;
        int[] expected = numberHelper.multiplesOfN(base, range);
        Assert.assertArrayEquals(expected, numberHelper.multiplesOfN(base, range));
    }





    @After
    public void teardown(){
        numberHelper = null;
    }

}
