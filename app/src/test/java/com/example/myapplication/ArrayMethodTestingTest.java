package com.example.myapplication;

import org.junit.After;
import org.junit.Before;

public class ArrayMethodTestingTest {

    private ArrayMethodTesting arrayMethodTesting;

    @Before
    public void setup(){
        arrayMethodTesting = ArrayMethodTesting.getInstance();
    }






    @After
    public void tearDown(){
        arrayMethodTesting = null;
    }


}
