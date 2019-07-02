package com.stackroute.pe2;

public class PowerOf4 {
        // Function to check if
        // x is power of 4
        public String isPowerOfFour(int number) {
            String result;
            if (number == 0)
                return "Number is zero";
            while (number != 1) {
                if (number % 4 != 0) {
                    result = "Not power of 4";
                    return result;
                }
                number = number / 4;
            }
            result = "Number is power of 4";
            return result;
        }
    }

