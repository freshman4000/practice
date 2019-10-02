package ru.efremov.javamentor.convertors;

import ru.efremov.javamentor.Conversion;
import ru.efremov.javamentor.data.AlphabetDatabase;

import java.util.Map;

/**
 * This class is responsible for conversion from Arab to Roman numbers.
 */
public class ArabToRomanConverter implements Conversion {
    /**
     * This method takes arab number, included in database, and converts it to roman number.
     * @param input arab number.
     * @return roman number.
     */
    @Override
    public String convert(String input) {
        String result = input;
        for (Map.Entry<String, String> pair : new AlphabetDatabase().getConversionTable().entrySet()) {
            if (pair.getValue().equals(input)) {
                result = pair.getKey();
            }
        }
        return result;
    }
}
