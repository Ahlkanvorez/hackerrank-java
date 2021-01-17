package io.robertm.hackerrank.java;

import java.util.stream.IntStream;
import java.util.function.IntUnaryOperator;

public class Loops2 {
    public static IntUnaryOperator term(final int a, final int b) {
        return n -> a + b * IntStream.rangeClosed(0, n).map(m -> (int)Math.pow(2, m)).sum();
    }

    public static void series(final int a, final int b, final int n) {
        final IntUnaryOperator term = Loops2.term(a, b);
        IntStream.range(0, n).map(term).mapToObj(x -> x + " ")
            .forEachOrdered(System.out::print);
        System.out.println();
    }
}
