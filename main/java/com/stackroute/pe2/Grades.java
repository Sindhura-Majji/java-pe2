package com.stackroute.pe2;


public class Grades {
    static int sum=0,i=0;
    static double avg;

    public double avarage(int number[]) {
        if (number.length - 1 < 1) {
            return 0;
        } else {
            for (i = 0; i <= number.length - 1; i++) {
                sum = sum + number[i];
            }

            avg = sum / number.length - 1;

            return avg;
        }
    }


    public int max(int number[]) {
        int max = number[0];
        if (number.length - 1 < 1) {
            return 0;
        } else {
            for (i = 0; i <= number.length - 1; i++) {
                if (number[i] > max) {
                    max = number[i];
                }
            }
            return max;
        }
    }

    public int min(int number[]) {
        int min = number[0];
        if (number.length - 1 < 1) {
            return 0;
        } else {

            for (i = 0; i <= number.length - 1; i++) {
                if (number[i] < min) {
                    min = number[i];
                }
            }
            return min;
        }
    }

}