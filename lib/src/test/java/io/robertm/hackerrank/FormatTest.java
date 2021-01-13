package io.robertm.hackerrank;

import org.junit.Test;
import static org.junit.Assert.*;

public class FormatTest {
    @Test
    public void testFormatOnEmptyString() {
        assertEquals(Format.header + "" + Format.header,
                     Format.format(""));
    }
    @Test
    public void testFormatOnThreeLines() {
        assertEquals(Format.header +
                     "java           100\n" +
                     "cpp            065\n" +
                     "python         050\n" +
                     Format.header,
                     Format.format("java 100\ncpp 65\npython 50\n"));
    }
}
