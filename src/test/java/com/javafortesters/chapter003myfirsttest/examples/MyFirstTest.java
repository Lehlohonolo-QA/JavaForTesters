package com.javafortesters.chapter003myfirsttest.examples;

import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {

    //the method declaration
    //annotate the method with @Test do JUnit can recognise the test

    @Test
    public void canAddTwoPlusTwo(){
        int answer= 2+2;
        Assert.assertEquals("The sum of 2 + 2 = 4",4,answer);

        System.out.println(answer);


    }
}


