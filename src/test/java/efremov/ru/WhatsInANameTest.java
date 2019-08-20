package efremov.ru;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.core.Is;
import ru.efremov.WhatsInAName6kye;

public class WhatsInANameTest {
    @Test
    public void whenNoMatchThenFalse() {
       Assert.assertThat(WhatsInAName6kye.nameInStr("A live son", "Allison"), Is.is(false));
    }
    @Test
    public void whenNoMatchThenFalse1() {
        Assert.assertThat(WhatsInAName6kye.nameInStr("Next to a lake", "chris"), Is.is(false));
    }
    @Test
    public void whenNoMatchThenFalse2() {
        Assert.assertThat(WhatsInAName6kye.nameInStr("Under a sea", "chris"), Is.is(false));
    }
    @Test
    public void whenNoMatchThenFalse3() {
        Assert.assertThat(WhatsInAName6kye.nameInStr("A crew that boards the ship", "chris"), Is.is(false));
    }
    @Test
    public void whenNoMatchThenFalse4() {
        Assert.assertThat(WhatsInAName6kye.nameInStr("A live son", "Allison"), Is.is(false));
    }
    @Test
    public void whenMatchThenTrue() {
        Assert.assertThat(WhatsInAName6kye.nameInStr("Across the rivers", "chris"), Is.is(true));
    }
}
