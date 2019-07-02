package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4Test {

    PowerOf4 powerOf4;
    @Before
    public void setUp() {
        powerOf4 = new PowerOf4();
    }

    @After
    public void tearDown() {
        powerOf4 = null;
    }
    @Test
    public void givenStringContainsIntegerNumberShouldReturnResultMessage() {
        //Arrange
        //Act
        String result = powerOf4.isPowerOfFour(64);
        //Assert
        assertEquals("Number is power of 4", result);

    }
    @Test
    public void givenStringContainsNotPowerOf4NumberShouldReturnResultMessage() {
        //Arrange
        //Act
        String result = powerOf4.isPowerOfFour(10);
        //Assert
        assertEquals("Not power of 4", result);

    }
    @Test
    public void givenStringContainsZeroShouldReturnResultMessage() {
        //Arrange
        //Act
        String result = powerOf4.isPowerOfFour(0);
        //Assert
        assertEquals("Number is zero", result);

    }
}