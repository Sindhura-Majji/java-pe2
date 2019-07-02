package com.stackroute.pe2;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;
    @Before
    public void setUp(){
        factorial=new Factorial();
    }

    @After
    public void tearDown(){
        factorial=null;
    }
    @Test
    public void givenStringContainsLongNumberShouldReturnFactorial() {
    //Arrange
    //Act
        String result = factorial.findFactorialLong(18);
    //Assert
        assertEquals("factorial is 6402373705728000", result);
    }
    @Test
    public void givenStringContainsLongNumberShouldReturnOutOfRangeMessage() {
    //Arrange
    //Act
        String result = factorial.findFactorialLong(26);
    //Assert
        assertEquals("factorial is out of range", result);
    }
    @Test
    public void givenStringContainsIntegerNumberShouldReturnFactorial() {
    //Arrange
    //Act
        String result = factorial.findFactorialInt(8);
    //Assert
        assertEquals("factorial is 40320", result);
    }
    @Test
    public void givenStringContainsIntegerNumberShouldReturnOutOfRangeMessage() {
    //Arrange
    //Act
        String result = factorial.findFactorialInt(17);
    //Assert
        assertEquals("factorial is out of range", result);
    }


}
