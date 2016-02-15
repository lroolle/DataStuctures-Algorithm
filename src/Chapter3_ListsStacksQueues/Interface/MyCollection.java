package Chapter3_ListsStacksQueues.Interface;


/**
 * A collection represents a group of objects, known as its elements.
 * Some collections allow duplicate elements and others do not.
 * Some are ordered and others unordered.
 *
 * @author Eric Wang
 */
public interface MyCollection<T> extends Iterable<T> {
    /**
     * Some important methods in Collection interface
     */
    int size();

    boolean isEmpty();

    void clear();

    boolean contains(T x);

    boolean add(T x);

    boolean remove(T x);

    java.util.Iterator<T> iterator();
}
