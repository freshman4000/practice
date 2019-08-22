package ru.efremov.codewars.lvl7kyu;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        //TODO
        int start = n * n + (n - 1);
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += start;
            start = start - 2;
        }
        return result;
    }
}
