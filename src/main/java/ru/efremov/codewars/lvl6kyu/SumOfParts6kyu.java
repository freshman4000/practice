package ru.efremov.codewars.lvl6kyu;

import java.util.Comparator;

public class SumOfParts6kyu {
    public static int[] sumParts(int[] ls) {
        // need to have algo time O(n)
        int[] result = new int[ls.length + 1];
        int sum = 0;
        int counter = ls.length - 1;
        for (int i = 0; i < ls.length; i++) {
            sum += ls[counter];
            result[counter--] = sum;
        }
        return result;
    }
}
