package Chapter2_AlgorithmAnalysis;


/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class MaxSubSum {
    /**
     * Recursive maximum contiguous subsequence sum algorithm.
     * Find  maximum sum in subarry spanning a[left, right].
     * Not to attempt to maintain best sequence.
     * Time O(N log N).
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int maxSumRec(int [ ] arr, int left, int right){

        if(left == right)
            if(arr[left] > 0)
                return arr[left];
            else
                return 0;

        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(arr, left, center);
        int maxRightSum = maxSumRec(arr, center  + 1, right);

        int maxLeftBorderSum = 0;
        int leftBorderSum = 0;
        for(int i = center; i >= left; i--){
            leftBorderSum += arr[i];
            if(leftBorderSum > maxLeftBorderSum)
                maxLeftBorderSum = leftBorderSum;
        }

        int maxRightBorderSum = 0;
        int rightBorderSum = 0;
        for(int i = center + 1; i <= right; i++){
            rightBorderSum += arr[i];
            if(rightBorderSum > maxRightBorderSum)
                maxRightBorderSum = rightBorderSum;
        }

        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);

    }

    private static int max3(int maxLeftSum, int maxRightSum, int maxBorderSum) {
        return Math.max(Math.max(maxLeftSum, maxRightSum), maxBorderSum);
    }

    /**
     * Driver for Divide-and-conquer maximum contiguous subsequence sum
     */
    public static int maxSubSum3(int [ ] arr){
        return maxSumRec(arr, 0, arr.length - 1);
    }

    /**
     * Linear-time maximum contiguous subsequence sub algorithm.
     *
     * @param  arr int array
     * @return Max sequence sum
     */
    public static int maxSubSum4(int [] arr){

        int maxSum = 0, thisSum = 0;

        for(int a : arr){
            thisSum += a;

            if(thisSum > maxSum)
                maxSum = thisSum;
            else if(thisSum < 0)
                thisSum = 0;
        }

        return maxSum;
    }
}
