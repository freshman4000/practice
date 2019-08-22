package ru.efremov.codewars.lvl6kyu;

import java.lang.*;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        System.out.println(morseCode);
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String[] str = morseCode.split("   ");
        StringBuilder sb = new StringBuilder("");
        for (int i =0; i < str.length; i++) {
            String[] word = str[i].split(" ");
            for (int j = 0; j < word.length; j++) {
                if(!word[j].equals("") && !word[j].equals(" ")) {
                    sb.append(MorseCode.get(word[j]));
                }
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
     class MorseCode{
    private static Map<String, String> dict = new HashMap<>();
    public static String get (String string) {
        return dict.get(string);
    }

}