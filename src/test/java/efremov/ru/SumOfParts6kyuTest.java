package efremov.ru;

import org.junit.Test;
import org.hamcrest.core.Is;
import org.junit.Assert;
import ru.efremov.codewars.lvl6kyu.SumOfParts6kyu;

/**
 * Test.
 */
public class SumOfParts6kyuTest {
    @Test
    public void whenArrThenSumOfParts() {
        int[] incoming =  {0, 1, 3, 6, 10};
        int[] expected = {20, 20, 19, 16, 10, 0};
        Assert.assertThat(SumOfParts6kyu.sumParts(incoming), Is.is(expected));
    }
}
