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
    public void isLessThan10Test(){
        String testString = "Hello";
        Assert.assertTrue(StringManipulator.getInstance().isLessThan10(testString));
    }


    @Test
    public void isLessThan10TestNull(){
        Assert.assertFalse(StringManipulator.getInstance().isLessThan10( null));
    }


    @After
    public void tearDown() throws Exception{
        stringManipulator = null;
    }
}
