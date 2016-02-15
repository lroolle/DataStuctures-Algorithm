package Chapter3_ListsStacksQueues.Interface;

/**
 * The idea of the MyIterator is that via the iterator method,each collection can create,
 * and return to the client, an object that implements the MyIterator interface
 * and stores internally its notion of a current position.
 *
 * @author Eric Wang
 */
public interface MyIterator<T> {
    /**
     * Some important method in Iterator interface.
     */
    boolean hasNext();

    T next();

    void remove();
}
