package Chapter1_Introduction;

import java.util.Comparator;

/**
 * Generic find max
 * with a function object
 * compares two strings lexicographically, ignoring case differences.
 *
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class GenericFindmax {

    public static <AnyType> AnyType findMax(AnyType [] arr, Comparator<? super AnyType> cmp) {

        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            if (cmp.compare(arr[i], arr[maxIndex]) > 0)
                maxIndex = i;
        }

        return arr[maxIndex];
    }

}

class CaseInsensitiveCompare implements  Comparator<String>{
    public int compare(String lhs, String rhs){
        return lhs.compareToIgnoreCase(rhs);
    }
}
