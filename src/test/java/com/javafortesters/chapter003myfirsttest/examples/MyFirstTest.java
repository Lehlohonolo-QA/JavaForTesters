package com.javafortesters.chapter003myfirsttest.examples;

import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {
    int answer;
    //the method declaration
    //annotate the method with @Test do JUnit can recognise the test

    @Test
    public void canAddTwoPlusTwo() {
        answer = 2 + 2;
        Assert.assertEquals("The sum of 2 + 2 = 4", 4, answer);

        System.out.println("2+2 = " + answer);

    }
    @Test
    public void canSubtractTwoMinusTwo() {
        answer = 2 - 2;
        Assert.assertEquals("Subtraction of 2-2=0", 0, answer);

        System.out.println("2-2 = " + answer);

    }

    @Test
    public void canDivideFourByTwo() {
        answer = 4 / 2;
        Assert.assertEquals("The division of 4/2 = 2", 2, answer);

        System.out.println("4/2 = "+ answer);
    }

    @Test
    public void canMultiplyTwoByTwo(){
        answer= 2* 2;
        Assert.assertEquals("The product of 2*2=4",4,answer);

        System.out.println("2*2 = " + answer);
    }
}


