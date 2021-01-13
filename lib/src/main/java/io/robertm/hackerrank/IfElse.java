package io.robertm.hackerrank;

import java.util.Scanner;

public class IfElse {
    public static String isWeird(final int n) {
        return ((n % 2 == 1) || (6 <= n && n <= 20))
            ? "Weird"
            : "Not Weird";
    }
}
