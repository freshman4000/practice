package ru.efremov.javamentor.calculators;

import ru.efremov.javamentor.Calculator;
import ru.efremov.javamentor.commands.AddCommand;
import ru.efremov.javamentor.commands.DivideCommand;
import ru.efremov.javamentor.commands.MultiplyCommand;
import ru.efremov.javamentor.commands.SubtractCommand;

/**
 * Class, representing calculator that has for actions.
 */
public class FourActionCalculator implements Calculator {
    /**
     * Method that decides which action calculator should process.
     * @param command String value of command.
     * @param query String value of user query.
     */
    @Override
    public void executeCommand(String command, String query) {
        switch (command) {
            case "+" : new AddCommand().doAction(query);
                break;
            case "-" : new SubtractCommand().doAction(query);
                break;
            case "/" : new DivideCommand().doAction(query);
                break;
            case "*" : new MultiplyCommand().doAction(query);
                break;
        }
    }
}
