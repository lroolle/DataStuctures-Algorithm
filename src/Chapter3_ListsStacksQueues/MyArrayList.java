package Chapter3_ListsStacksQueues;

import java.util.Iterator;

/**
 * @author Eric Wang
 */
public class MyArrayList<T> implements Iterable<T>{

    private static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private T [] theItems;

    public MyArrayList(){ clear(); }

    public void clear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize)
            return;
        T [] old = theItems;
        theItems = (T []) new Object[newCapacity];
        for(int i = 0; i <= size(); i++)
            theItems[i] = old[i]; // System.arraycopy(old, 0, theItems, 0, size() + 1);
    }

    public T get(int idx) {
        if (idx < 0 || idx >= size())
            throw new ArrayIndexOutOfBoundsException();
        return theItems[idx];
    }

    public T set(int idx, T newVal) {
        if (idx < 0 || idx >= size())
            throw new ArrayIndexOutOfBoundsException();
        T old = theItems[idx];
        theItems[idx] = newVal;
        return old;
    }

    public boolean add(T x) {
        add(size(), x);
        return true;
    }

    public void add(int idx, T x) {
        if (theItems.length == size())
            ensureCapacity(size() * 2 + 1);
        for (int i = theSize; i > idx; i--)
            theItems[i] = theItems[i-1];
        theItems[idx] = x;

        theSize++;
    }

    public void remove(int idx) {
        T removedItem = theItems[idx];
        for (int i = idx; i < size() - 1; i++)
            theItems[i] = theItems[i+1];

        theSize--;
    }

    public boolean remove(T x) {
        if(!contains(x))
            return false;
        for (int i = 0; i < size() - 1; i++) {
            if (theItems[i].equals(x))
                remove(i);
        }

        theSize--;
        return true;
    }

    public int size() {

        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(T x) {
        for (int i = 0; i < size() - 1; i++) {
            if (theItems[i].equals(x))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator<T> (this);
    }

    /**
     * Nested class
     * Inner class of iterator
     */
    private static class ArrayListIterator<T> implements Iterator<T> {

        private int current = 0;
        private MyArrayList<T> theList;

        public ArrayListIterator(MyArrayList<T> list){
            theList = list;
        }

        @Override
        public boolean hasNext() {
            return current < theList.size();
        }

        @Override
        public T next() {
            return theList.theItems[current++]; // MyArrayList.this.theItems[current++]
        }

        @Override
        public void remove(){
            theList.remove(--current);
        }
    }
}



