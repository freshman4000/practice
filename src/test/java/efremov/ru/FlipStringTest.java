package efremov.ru;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.core.Is;
import ru.efremov.FlipString7kyu;

/**
 * Test.
 */
public class FlipStringTest {
    /**
     * Testing lower more.
     */
    @Test
    public void whenLowerMoreOrEqualThenAllLower() {
        String input = "himynameIsVit";
        String result = FlipString7kyu.solve(input);
        String expected = "himynameisvit";
        Assert.assertThat(result, Is.is(expected));

    }

    /**
     * Testing Upper more.
     */
    @Test
    public void whenUpperMoreOrEqualThenAllLower() {
        String input = "HiMyNAMEIsVit";
        String result = FlipString7kyu.solve(input);
        String expected = "HIMYNAMEISVIT";
        Assert.assertThat(result, Is.is(expected));
    }
}
