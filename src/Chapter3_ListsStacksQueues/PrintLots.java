package Chapter3_ListsStacksQueues;

import java.util.Iterator;
import java.util.List;

/**
 * @author Eric <wrqatw@gmail.com>.
 */


public class PrintLots {
    public static <AnyType> void printLots(List<AnyType> L, List<Integer> P) {
        Iterator<AnyType> iterL = L.iterator();
        Iterator<Integer> iterP = P.iterator();
        AnyType itemL = null;
        Integer itemP = 0;
        int start = 0;
        while ( iterL.hasNext() && iterP.hasNext() ) {
            itemP = iterP.next();
            System.out.println("Looking for position " + itemP);
            while ( start < itemP && iterL.hasNext() ) {
                start++;
                itemL = iterL.next();
            }
            System.out.println(itemL);
        }
    }
}
