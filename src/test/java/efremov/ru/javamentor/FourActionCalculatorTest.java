package efremov.ru.javamentor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.core.Is;
import ru.efremov.javamentor.calcui.FourActionCalcUI;
import ru.efremov.javamentor.inputs.StringInputForTest;

import java.io.*;

/**
 * Testing class.
 */
public class FourActionCalculatorTest {
    private PrintStream standardOut = System.out;
    private InputStream standardIn = System.in;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setBefore() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void setAfter() {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    /**
     * Testing arab numbers addition.
     */
    @Test
    public void whenArab2Plus2Then4() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"2 + 2", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("4" + System.lineSeparator()));
    }

    /**
     * Testing roman numbers addition.
     */
    @Test
    public void whenRoman2Plus2Then4() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"II + II", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("IV" + System.lineSeparator()));
    }

    /**
     * Testing arab numbers subtraction.
     */
    @Test
    public void whenArab2Minus2Then0() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"2 - 2", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("0" + System.lineSeparator()));
    }

    /**
     * Testing roman numbers subtraction.
     */
    @Test
    public void whenRomanIIMinusIThenI() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"II - I", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("I" + System.lineSeparator()));
    }

    /**
     * Testing roman numbers conversion - when no such number in database.
     */
    @Test
    public void whenRomanIIMinusIIThen0() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"II - II", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("0" + System.lineSeparator()));
    }

    /**
     * Testing arab numbers multiplication.
     */
    @Test
    public void whenArab2Mul2Then4() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"2 * 2", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("4" + System.lineSeparator()));
    }

    /**
     * Testing roman numbers multiplication.
     */
    @Test
    public void whenRoman2Mul2Then4() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"II * II", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("IV" + System.lineSeparator()));
    }

    /**
     * Testing arab numbers division.
     */
    @Test
    public void whenArab2Div2Then1() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"2 / 2", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("1" + System.lineSeparator()));
    }

    /**
     * Testing roman numbers division.
     */
    @Test
    public void whenRoman2Div2Then1() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"II / II", "exit"})).start();
        Assert.assertThat(out.toString(), Is.is("I" + System.lineSeparator()));
    }

    /**
     * Testing wrong regex input.
     */
    @Test(expected = IllegalArgumentException.class)
    public void whenWrongRegexThenException() {
        new FourActionCalcUI(new StringInputForTest(new String[]{"xxx"})).start();
    }
}
