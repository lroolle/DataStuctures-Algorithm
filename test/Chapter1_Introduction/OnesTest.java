package Chapter1_Introduction;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class OnesTest {

    @Test
    public void testOnes() throws Exception {
        int n = 2;
        int expected = 1;
        int actual = Ones.ones(n);
        Assert.assertEquals("Should be equal: "+ expected+" = "+actual, expected, actual);
    }
}