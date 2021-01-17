package io.robertm.hackerrank.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Loops2Test {
    private PrintStream originalOut;
    private ByteArrayOutputStream mockedOut = new ByteArrayOutputStream();

    @Before
    public void mockStdout() {
        originalOut = new PrintStream(System.out);
        System.setOut(new PrintStream(mockedOut));
    }

    @After
    public void restoreStdout() {
        System.setOut(originalOut);
    }

    @Test
    public void testSeries() {
        Loops2.series(0, 2, 2);
        assertEquals("" +
                     (0 + 2 * (int)Math.pow(2, 0)) + " " +
                     (0 + 2 * ((int)Math.pow(2, 0) + (int)Math.pow(2, 1))) + " " +
                     "\n",
                     mockedOut.toString());
    }
}
