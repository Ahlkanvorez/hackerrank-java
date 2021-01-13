package io.robertm.hackerrank;

import org.junit.Test;
import static org.junit.Assert.*;

public class IfElseTest {
    @Test
    public void testIsWeirdForOdds() {
        for (int i = 1; i < 100; i += 2) {
            assertEquals("Weird", IfElse.isWeird(i));
        }
    }

    @Test
    public void testIsWeirdForSmallEvens() {
        for (int i = 2; i < 5; i += 2) {
            assertEquals("Not Weird", IfElse.isWeird(i));
        }
    }

    @Test
    public void testIsWeirdForMediumEvens() {
        for (int i = 6; i <= 20; i += 2) {
            assertEquals("Weird", IfElse.isWeird(i));
        }
    }

    @Test
    public void testIsWeirdForLargeEvens() {
        for (int i = 22; i <= 100; i += 2) {
            assertEquals("Not Weird", IfElse.isWeird(i));
        }
    }
}
