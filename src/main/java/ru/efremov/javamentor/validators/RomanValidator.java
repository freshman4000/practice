package ru.efremov.javamentor.validators;

import ru.efremov.javamentor.Validation;
import ru.efremov.javamentor.data.AlphabetDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that validates input.
 */
public class RomanValidator implements Validation {
    /**
     * Variable approves, if last input was validated or not.
     */
    private static boolean isOn = false;

    /**
     * Standard getter.
     *
     * @return boolean value.
     */
    public static boolean isOn() {
        return isOn;
    }

    /**
     * This method validates if input regex is correct and if input
     * contains roman numbers.
     *
     * @param input value.
     * @return boolean value.
     */
    @Override
    public boolean validate(String input) {
        AlphabetDatabase db = new AlphabetDatabase();
        List<String> romNum = new ArrayList<>(db.getConversionTable().keySet());
        String[] buf = input.split(" ");
        isOn = romNum.contains(buf[0]) && romNum.contains(buf[2]) && buf[1].matches("[\\*\\+-/]");
        return isOn;
    }
}
