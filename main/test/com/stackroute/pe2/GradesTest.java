package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesTest {
    Grades grades;

    @Before
    public void setUp() {
        grades = new Grades();
    }


    @After
    public void tearDown() {
        grades = null;
    }

    @Test

    public void calculateAvgMaxMinOfStudentgrades() {
        double avarage = Grades.avarage(new int[]{45, 78, 90, 25});
        assertEquals(59.5, avarage, 59.5);
        int maximum = Grades.max(new int[]{45, 78, 90, 25});
        assertEquals(90, maximum);
        int minimum = Grades.min(new int[]{45, 78, 90, 25});
        assertEquals(25, minimum);

    }

    @Test

    public void returnZeroIfArrayLengthIsLessthan2() {
        int max = Grades.max(new int[]{1});
        assertEquals(0, max);
        int min = Grades.min(new int[]{1});
        assertEquals(0, min);
        double average = Grades.avarage(new int[]{1});
        assertEquals(0, average, 0);


    }
}