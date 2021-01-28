package io.robertm.hackerrank.java;

import java.util.Calendar;

public class DateAndTime {
    public static String findDay(final int month, final int day, final int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1); // month is 0 indexed
        c.set(Calendar.DAY_OF_MONTH, day);
        final int weekday = c.get(Calendar.DAY_OF_WEEK);
        switch (weekday) {
        case Calendar.SUNDAY:    return "SUNDAY";
        case Calendar.MONDAY:    return "MONDAY";
        case Calendar.TUESDAY:   return "TUESDAY";
        case Calendar.WEDNESDAY: return "WEDNESDAY";
        case Calendar.THURSDAY:  return "THURSDAY";
        case Calendar.FRIDAY:    return "FRIDAY";
        case Calendar.SATURDAY:  return "SATURDAY";
        default: throw new RuntimeException("Unknown day of week: " + weekday);
        }
    }
}
