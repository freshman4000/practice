package ru.efremov.javamentor.inputs;

import ru.efremov.javamentor.Input;

/**
 * Class that mocks input for test purposes.
 */
public class StringInputForTest implements Input {
    /**
     * Value of current mock input string position in mock array.
     */
    private int position = 0;
    /**
     * Array of mock values.
     */
    private String[] queries;

    /**
     * Standard constructor.
     * @param queries array of String values for mock string input.
     */
    public StringInputForTest(String[] queries) {
        this.queries = queries;
    }

    /**
     * Main method that picks next mocking string value from array and
     * passes it as input to class that implements UI.
     * @return string value.
     */
    @Override
    public String processInput() {
        String result = queries[position++];
        return result;
    }
}
