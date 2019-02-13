package com.example.myapplication;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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



    @After
    public void teardown(){
        numberHelper = null;
    }

}
