package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest evenNumTest;
    @Before
    public void setUp()
    {
        evenNumTest = new EvenNumTest();
    }

    @After
    public void tearDown()
    {
        evenNumTest = null;
    }
    @Test
    public void givenStringContainsEvenShouldReturnTrueMessage(){

        //Arrange
        //Act
        boolean result = evenNumTest.isEven( 8);
        //Assert
        assertTrue(result);

    }
    @Test
    public void givenStringContainsOddShouldReturnFalseMessage(){

        //Arrange
        //Act
        boolean result = evenNumTest.isEven( 5);
        //Assert
        assertFalse(result);

    }
    @Test
    public void givenStringContainsNegativeIntegerShouldReturnFalseMessage(){

        //Arrange
        //Act
        boolean result = evenNumTest.isEven( -5);
        //Assert
        assertFalse(result);

    }

}