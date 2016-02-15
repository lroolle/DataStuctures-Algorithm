package Chapter3_ListsStacksQueues;

import Chapter3_ListsStacksQueues.Interface.MyCollection;

import java.util.Iterator;

/**
 *
 * @author Eric Wang
 */
public class IterableEnchancedForLoop {
    public static <T> void print(MyCollection<T> coll) {
        Iterator<T> itr = coll.iterator();

        while (itr.hasNext()) {
            T item = itr.next();
            System.out.println(item);
        }
    }
}
