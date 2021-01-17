package io.robertm.hackerrank.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Loops1Test {
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
    public void testTableFor2() {
        Loops1.multiplicationTable(2);
        assertEquals("2 x 1 = 2\n" +
                     "2 x 2 = 4\n" +
                     "2 x 3 = 6\n" +
                     "2 x 4 = 8\n" +
                     "2 x 5 = 10\n" +
                     "2 x 6 = 12\n" +
                     "2 x 7 = 14\n" +
                     "2 x 8 = 16\n" +
                     "2 x 9 = 18\n" +
                     "2 x 10 = 20\n",
                     mockedOut.toString());
    }
}
