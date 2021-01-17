package io.robertm.hackerrank.java;

import java.util.stream.IntStream;

public class Loops1 {
    public static void multiplicationTable(final int n) {
        IntStream.rangeClosed(1, 10)
            .mapToObj(m -> String.format("%d x %d = %d", n, m, n * m))
            .forEachOrdered(System.out::println);
    }
}
