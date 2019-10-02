package ru.efremov.javamentor.inputs;

import ru.efremov.javamentor.Input;

import java.util.Scanner;

/**
 * This class get input and processes input to UI.
 */
public class KeyBoardInput implements Input {
    /**
     * This method gets info from user and processes it to class object,
     * that implements UI interface.
     * @return String value.
     */
    @Override
    public String processInput() {
        return new Scanner(System.in).nextLine();
    }
}
