package Chapter4_Trees;

import java.nio.BufferUnderflowException;

/**
 * A binary search tree (BST), which may sometimes also be called an ordered or
 * sorted binary tree, is a node-based binary tree data structure which has the
 * following properties:
 * 1) The left subtree of a node contains only nodes with keys less than the node's key.
 * 2) The right subtree of a node contains only nodes with keys greater than the node's key.
 * 3) Both the left and right subtrees must also be binary search trees.
 *
 * @author Eric Wang
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    private static class BinaryNode<T> {
        T element;
        BinaryNode<T> left;
        BinaryNode<T> right;

        BinaryNode(T theElement) {
            this(theElement, null, null);
        }

        BinaryNode(T theElement, BinaryNode<T> lt, BinaryNode<T> rt) {
            element = theElement;
            left = lt;
            right = rt;
        }
    }

    private BinaryNode<T> root; // The root node

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(T x) {
        return contains(x, root);
    }

    public T findMin() {
        if (isEmpty())
            throw new BufferUnderflowException();
        return findMin(root).element;
    }

    public T findMax() {
        if (isEmpty())
            throw new BufferUnderflowException();
        return findMax(root).element;
    }

    public void insert(T x) {
        root = insert(x, root);
    }

    public void remove(T x) {
        root = remove(x, root);
    }

    public void printTree() {
    }

    /**
     * Internal method to find if an element in the Binary Tree
     *
     * @param x element to find
     * @param t root node
     * @return return true if contains
     */
    private boolean contains(T x, BinaryNode<T> t) {
        if (t == null)
            return false;

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0)
            return contains(x, t.left);
        else
            return compareResult <= 0 || contains(x, t.right);
    }

    private  BinaryNode<T> findMin(BinaryNode<T> t){
        if (t == null)
            return null;
        else if (t.left == null)
            return t;
        return findMin(t.left);
    }

    private  BinaryNode<T> findMax(BinaryNode<T> t){
        if (t == null)
            return null;
        else if (t.right == null)
            return t;
        return findMax(t.right);
    }

    private BinaryNode<T> insert(T x, BinaryNode<T> t) {
        if (t == null)
            return new BinaryNode<>(x, null, null);

        int compareResult = x.compareTo(t.element);

        if(compareResult < 0)
            t.left = insert(x, t.left);
        else
            t.right = insert(x, t.right);
        return t;
    }

    private BinaryNode<T> remove(T x, BinaryNode<T> t) {
        if ( t == null)
            return null;
        int compareResult = x.compareTo(t.element);

        if(compareResult < 0)
            t.left = remove(x, t.left);
        else if(t.left != null && t.right != null){
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);
        }
        else
            t = (t.left !=  null) ? t.left : t.right;

        return t;
    }
}
