package ru.efremov.javamentor.validators;

import ru.efremov.javamentor.Validation;

/**
 * Class that validates input.
 */
public class ArabValidator implements Validation {
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
     * contains arab numbers.
     *
     * @param input value.
     * @return boolean value.
     */
    @Override
    public boolean validate(String input) {
        isOn = input.matches("([1-9]|10) ([\\*\\+-/]) ([1-9]|10)");
        return isOn;
    }
}
