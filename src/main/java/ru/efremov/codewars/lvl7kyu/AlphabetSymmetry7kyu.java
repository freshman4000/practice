package ru.efremov.codewars.lvl7kyu;

import java.util.HashMap;
import java.util.Map;

public class AlphabetSymmetry7kyu {
    public static int[] solve(String[] arr){
        Map<Character, Integer> map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int i = 1;
        for (Character ch : alphabet.toCharArray()) {
            map.put(ch, i++);
        }
        int[] result = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int t = 0; t < arr[j].length(); t++) {
                if (map.get(arr[j].toLowerCase().charAt(t)) == t + 1) {
                    count++;
                }
            }
            result[j] = count;
        }
        return result;
    }
}

