package Chapter3_ListsStacksQueues.Interface;

import java.util.Iterator;

/**
 * An iterator for lists that allows the programmer
 * to traverse the list in either direction, modify
 * the list during iteration, and obtain the iterator's
 * current position in the list.
 *
 * @autor Eric Wang
 */
public interface MyListIterator<T> extends Iterator<T> {
    boolean hasPrevious();

    T previous();

    void add();
    void set();
}
