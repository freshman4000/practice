package ru.efremov;

public class WhatsInAName6kye {
    public static boolean nameInStr(String str, String name){
        String[] s = str.toLowerCase().split("");
        String[] n = name.toLowerCase().split("");
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (n[counter].equals(s[i])) {
                counter++;
            }
        }
        return counter == name.length();
    }
}
