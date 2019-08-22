package ru.efremov.codewars.lvl7kyu;

public class FlipString7kyu {
    public static String solve(final String str) {
       long n = str.chars().filter(Character::isLowerCase).count();

        return n >= str.length() - n ? str.toLowerCase() : str.toUpperCase();
    }
}
