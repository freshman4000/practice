package efremov.ru;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.core.Is;
import ru.efremov.codewars.lvl7kyu.RowSumOddNumbers;

public class RowSumOddNumbersTest {
    @Test
    public void when29Then125() {
        int sum = RowSumOddNumbers.rowSumOddNumbers(5);
        Assert.assertThat(sum, Is.is(125));
    }
}
