package Chapter1_Introduction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class GenericFindmaxTest {

    @Test
    public void testFindMax() throws Exception {
        String [] arr = {"apple", "banana"};
        assertEquals("banana", GenericFindmax.findMax(arr, new CaseInsensitiveCompare()));
    }
}