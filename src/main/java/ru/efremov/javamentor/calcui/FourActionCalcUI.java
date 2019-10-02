package ru.efremov.javamentor.calcui;

import ru.efremov.javamentor.Input;
import ru.efremov.javamentor.UI;
import ru.efremov.javamentor.calculators.FourActionCalculator;
import ru.efremov.javamentor.convertors.RomanToArabConverter;
import ru.efremov.javamentor.inputs.KeyBoardInput;
import ru.efremov.javamentor.validators.ArabValidator;
import ru.efremov.javamentor.validators.RomanValidator;

/**
 * Class that is responsible for communication with user.
 */
public class FourActionCalcUI implements UI {
    /**
     * Variable representing input interface.
     */
    private Input in;

    /**
     * Standard class constructor.
     * @param in object of class, that implements Input interface.
     */
    public FourActionCalcUI(Input in) {
        this.in = in;
    }

    /**
     * This method starts user interface.
     */
    @Override
    public void start() {

        while (true) {
            String query = in.processInput();
            if ("exit".equals(query)) {
                break;
            }
            boolean roman = new RomanValidator().validate(query);
            boolean arab = new ArabValidator().validate(query);
            if (roman) {
                query = new RomanToArabConverter().convert(query);
            } else if (!arab) {
                throw new IllegalArgumentException();
            }
            String action = query.split(" ")[1];
            new FourActionCalculator().executeCommand(action, query);
        }
    }

    /**
     * Program entrance pint.
     * Main method that can be run, to start program.
     * @param args - no args needed to start this version of program.
     */
    public static void main(String[] args) {
        new FourActionCalcUI(new KeyBoardInput()).start();
    }
}
