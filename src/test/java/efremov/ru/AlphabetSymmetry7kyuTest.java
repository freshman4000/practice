package efremov.ru;

import org.junit.Test;
import org.junit.Assert;
import  org.hamcrest.core.Is;
import ru.efremov.codewars.lvl7kyu.AlphabetSymmetry7kyu;

public class AlphabetSymmetry7kyuTest {
    @Test
    public void whenABCthen3() {
        int[] result = AlphabetSymmetry7kyu.solve(new String [] {"abode", "ABc", "xyzD"});
        Assert.assertThat(result, Is.is(new int[]{4, 3, 1}));
    }
}
