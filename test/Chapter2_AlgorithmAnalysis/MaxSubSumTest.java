package Chapter2_AlgorithmAnalysis;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class MaxSubSumTest {
    private static int [ ] arr1 = {4, -3, 5, -2, -1, 2, 6};
    private static int [ ] arr2 = {-3, 5, -2, -1, 2, 6, -2, -2, -2, -2, -2};

    @Test
    public void testMaxSubSum1() throws Exception {
        assertEquals(11, MaxSubSum.maxSubSum3(arr1));
    }

    @Test
    public void testMaxSumRec() throws Exception {
        assertEquals(6, MaxSubSum.maxSumRec(arr1, 0, 5));
    }

    @Test
    public void testMaxSubSum2() throws Exception {
        assertEquals(11, MaxSubSum.maxSubSum4(arr1));
    }
    @Test
    public void testMaxSubSum3() throws Exception {
        assertEquals(10, MaxSubSum.maxSubSum4(arr2));
    }
}