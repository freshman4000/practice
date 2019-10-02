package ru.efremov.javamentor.commands;

import ru.efremov.javamentor.Command;
import ru.efremov.javamentor.convertors.ArabToRomanConverter;
import ru.efremov.javamentor.convertors.RomanToArabConverter;
import ru.efremov.javamentor.validators.RomanValidator;

import java.util.Arrays;
/**
 * Class responsible for addition.
 **/
public class AddCommand implements Command {
    /**
     * This method parses arab numbers from validated input, does addition, checks if roman or arab output is needed and
     * returns arab or roman styled answer.
     * @param input validated string input.
     */
    @Override
    public void doAction(String input) {
    int[] buf = Arrays.stream(input.split("\\+")).mapToInt(x -> Integer.parseInt(x.trim())).toArray();
        System.out.println(RomanValidator.isOn() ? new ArabToRomanConverter().convert(String.valueOf (buf[0] + buf[1]))
                                                 : String.valueOf (buf[0] + buf[1]));
    }
}
