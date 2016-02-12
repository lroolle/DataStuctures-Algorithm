package Chapter2_AlgorithmAnalysis;

/**
 * Binary search
 *
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class BinarySearch<AnyType> {
    /**
     * Sorted Array
     * binarySearch
     * @param a anytype [] array.
     * @param x item to search.
     * @return return index where item is found, or -1 if not found.
     */
    public static <AnyType extends Comparable<? super AnyType>>
    int binarySearch(AnyType [] a, AnyType x){
        int low = 0, high = a.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(a[mid].compareTo(x) < 0)
                low = mid + 1;
            else if(a[mid].compareTo(x) > 0)
                high = mid -1;
            else
                return mid; // Found
        }
        return -1; // Not Found
    }
}
