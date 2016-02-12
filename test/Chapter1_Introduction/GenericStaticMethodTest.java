package Chapter1_Introduction;

import com.sun.xml.internal.bind.AnyTypeAdapter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  It works only for objects that implement the Comparable interface,
 *  using compareTo as the basis for all comparison decisions.
 *
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class GenericStaticMethodTest {

    @Test
    public void testContains() throws Exception {
        Object [] arr = {1, 2, 3, 4};
        assertTrue(GenericStaticMethod.contains(arr, 4));
    }
    @Test
    public void testNotContains() throws Exception {
        Object [] arr = {1, 2, 3, 4};
        assertFalse(GenericStaticMethod.contains(arr, 5));
    }
}