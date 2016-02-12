package Chapter2_AlgorithmAnalysis;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class BinarySearchTest{

    @Test
    public void testBinarySearch() throws Exception {
        String [] a = {"a", "b", "c"};
        assertEquals(0, BinarySearch.binarySearch(a, "a"));
    }
}