package com.stackroute.pe2;

public class Palindrome {

    public String checkPalindrome(String string)
    {
        String result="";
        String temp = string;
        String reverse = "";
        int length = string.length();

        if ( string == " ")
        {
            result = "given string is empty";
        }
        else if (string.length()>1) {
            for (int i = length - 1; i >= 0; i--)
            {
                reverse = reverse + string.charAt(i);
            }

            if (reverse.contentEquals(temp)) {

                result = "It is a palindrome";
            } else {
                result = "Not a palindrome";
            }
        }
        return result;
    }

}

