package com.pattern.design;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        boolean hasAorB = false;

        // This is the sample list.
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f");


        // for string in strings. Loop in all items inside strings
        for (String string: strings) {

            if (string.equalsIgnoreCase("a") || string.equalsIgnoreCase("b")) {
                hasAorB = true;
            }
        }

        System.out.println("List has a or b ? : " + hasAorB);

    }
}
