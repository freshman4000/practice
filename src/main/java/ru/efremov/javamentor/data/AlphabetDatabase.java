package ru.efremov.javamentor.data;

import ru.efremov.javamentor.DataBase;

import java.util.HashMap;
import java.util.Map;

/**
 * Class that represents data needed to evaluate arab numbers into roman and vice versa.
 */
public class AlphabetDatabase implements DataBase {
    /**
     * Storage structure variable for data.
     */
    private Map<String, String> conversionTable = new HashMap<>();

    /**
     * Class constructor, that runs method,
     * that initializes database with needed values.
     */
    public AlphabetDatabase() {
        initDatabase();
    }

    /**
     * Standard getter for database data structure variable.
     * @return database data structure variable.
     */
    public Map<String, String> getConversionTable() {
        return conversionTable;
    }

    /**
     * Method that initializes database with needed values.
     */
    @Override
    public void initDatabase() {
        conversionTable.put("I", "1");
        conversionTable.put("II", "2");
        conversionTable.put("III", "3");
        conversionTable.put("IV", "4");
        conversionTable.put("V", "5");
        conversionTable.put("VI", "6");
        conversionTable.put("VII", "7");
        conversionTable.put("VIII", "8");
        conversionTable.put("IX", "9");
        conversionTable.put("X", "10");
    }
}
