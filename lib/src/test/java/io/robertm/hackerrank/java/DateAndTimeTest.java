package io.robertm.hackerrank.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateAndTimeTest {
    @Test
    public void testFindDay() {
        assertEquals("WEDNESDAY",
                     DateAndTime.findDay(1, 27, 2021));
        assertEquals("MONDAY",
                     DateAndTime.findDay(8, 14, 2017));
        assertEquals("WEDNESDAY",
                     DateAndTime.findDay(8, 5, 2015));
    }
}
