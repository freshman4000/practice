package ru.efremov.javamentor.convertors;

import ru.efremov.javamentor.Conversion;
import ru.efremov.javamentor.data.AlphabetDatabase;

/**
 * Class that is responsible for conversion from string, that includes roman numbers, to
 * the same string, but with arab numbers instead.
 */
public class RomanToArabConverter implements Conversion {
    /**
     * This method converts input from string, that includes roman numbers, to
     * the same string, but with arab numbers instead.
     * @param input current validated user input.
     * @return result of validation - boolean type.
     */
    @Override
    public String convert(String input) {
    String[] buf = input.split(" ");
    StringBuilder sb = new StringBuilder();
        return sb.append(new AlphabetDatabase().getConversionTable().get(buf[0]))
                 .append(" ")
                 .append(buf[1])
                 .append(" ")
                 .append(new AlphabetDatabase().getConversionTable().get(buf[2]))
                 .toString();
    }
}
