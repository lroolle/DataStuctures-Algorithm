package Chapter3_ListsStacksQueues.Interface;

import java.util.ListIterator;

/**
 * @author Eric Wang
 */
public interface MyList<T> extends MyCollection<T> {
    T get(int idx);

    T set(int idx, T val);

    void add(int idx, T val);

    void remove(int idx);

    ListIterator<T> listIterator(int previous);
}
