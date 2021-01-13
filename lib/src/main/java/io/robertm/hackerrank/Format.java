package io.robertm.hackerrank;

import java.util.Scanner;

public class Format {

    public static final String header = "================================\n";

    public static String format(final String in) {
        final Scanner s = new Scanner(in);
        StringBuilder formatted = new StringBuilder(header);

        while (s.hasNextLine()) {
            final String word = s.next();
            final int n = s.nextInt();
            s.nextLine();

            formatted.append(String.format("%-15s%03d%n", word, n));
        }

        return formatted.append(header).toString();
    }
}
