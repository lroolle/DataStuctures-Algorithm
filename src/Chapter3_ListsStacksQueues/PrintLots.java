package Chapter3_ListsStacksQueues;

import java.util.Iterator;
import java.util.List;

/**
 * Exercise 3.1
 * You are given a list, L, and another list, P,containing integers sorted in ascending order.
 * The operation printLots(L,P) will print the elements in L that are in positions specified by P.
 * For instance, if P=1,3,4,6, the elements in positions 1, 3, 4, and 6 in L are printed.
 * Write the procedure printLots(L,P). You may use only the public Collections API container
 * operations. What is the running time of your procedure?
 *
 * @author Eric Wang
 */
public class PrintLots {
    public static <T> void printLots(List<T> L, List<Integer> P) {
        Iterator<T> iterL = L.iterator();
        Iterator<Integer> iterP = P.iterator();
        T itemL = null;
        Integer itemP;
        int start = 0;
        while (iterL.hasNext() && iterP.hasNext()) {
            itemP = iterP.next();
            System.out.println("Looking for position " + itemP);
            while (start < itemP && iterL.hasNext()) {
                start++;
                itemL = iterL.next();
            }
            System.out.println(itemL);
        }
    }
}
