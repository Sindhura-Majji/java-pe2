package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;
    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown(){
        palindrome = null;
    }
    @Test
    public void givenStringContainsPalindromeShouldReturnPalindromeMessage(){
        //Arrange
        //Act
        String result = palindrome.checkPalindrome("mom");
        //Assert
        assertEquals("It is a palindrome", result);
        //Act
        String result1 = palindrome.checkPalindrome("232");
        //Assert
        assertEquals("It is a palindrome", result1);
        //Act
        String result2 = palindrome.checkPalindrome("#$#");
        //Assert
        assertEquals("It is a palindrome", result2);
    }
    @Test
    public void givenStringContainsNotPalindromeShouldReturnNotPalindromeMessage(){
        //Arrange
        //Act
        String result3 = palindrome.checkPalindrome("sindhu");
        //Assert
        assertEquals("Not a palindrome", result3);
        //Act
        String result4 = palindrome.checkPalindrome("2325");
        //Assert
        assertEquals("Not a palindrome", result4);
        //Act
        String result5 = palindrome.checkPalindrome("#$#%");
        //Assert
        assertEquals("Not a palindrome", result5);
    }
    @Test
    public void givenStringContainsNegativePalindromeShouldReturnErrorMessage() {
        //Arrange
        //Act
        String result6 = palindrome.checkPalindrome(" ");
        //Assert
        assertEquals("given string is empty", result6);
    }

}