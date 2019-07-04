package com.stackroute.pe2;

public class EvenNumTest {
    public static boolean isEven(int number) {
        boolean result;

        if (number < 0)
        {
            result = false;
        }
        else if (number % 2 == 0)
        {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
