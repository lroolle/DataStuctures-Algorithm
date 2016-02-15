package Chapter4_Trees;

import java.util.Comparator;

/**
 * An AVL tree is a self-balancing binary search tree, and it was the first such
 * data structure to be invented. In an AVL tree, the heights of the two child
 * subtrees of any node differ by at most one. AVL trees are often compared with
 * red-black trees because they support the same set of operations and because
 * red-black trees also take O(log n) time for the basic operations. Because AVL
 * trees are more rigidly balanced, they are faster than red-black trees for
 * lookup intensive applications. However, red-black trees are faster for
 * insertion and removal.
 *
 * @author Eric Wang
 */
public class AvlTree<T> {

    private Comparator<? super T> cmp;

    public AvlTree(Comparator<? super T> c) {
        cmp = c;
    }

    private static class AvlNode<T> {
        AvlNode(T theElement) {
            this(theElement, null, null);
        }

        AvlNode(T theElement, AvlNode<T> lt, AvlNode<T> rt) {
            element = theElement;
            left =lt;
            right = rt;
        }

        T          element;
        AvlNode<T> left;
        AvlNode<T> right;
        int        height;
    }

    private int height(AvlNode<T> t) {
        return t == null ? -1 : t.height;
    }

    private AvlNode<T> insert(T x, AvlNode<T> t) {
        if (t == null)
            return new AvlNode<>(x, null, null);

        int compareResult = compare(x, t.element);

        if (compareResult < 0) {
            t.left = insert(x, t.left);
            if (height(t.left) - height(t.right) == 2)
                if (compare(x, t.left.element) < 0)
                    t = rotateWithLeftChild(t);
                else
                    t = doubleWithLeftChild(t);
        }
        else if(compareResult > 0) {
            t.right = insert(x, t.right);
            if((height(t.right)-height(t.left)) == 2)
                if(compare(x, t.right.element) > 0)
                    t = rotateWithRightChild(t);
                else
                    t = doubleWithRightChild(t);
        }
        else
            ;
        t.height = Math.max(height(t.left), height(t.right) + 1);
        return t;
    }

    private AvlNode<T> doubleWithRightChild(AvlNode<T> k1) {
        k1.right = rotateWithLeftChild(k1.right);
        return rotateWithRightChild(k1);
    }

    private AvlNode<T> rotateWithRightChild(AvlNode<T> k2) {
        return k2;
    }

    private AvlNode<T> doubleWithLeftChild(AvlNode<T> k3) {
        return k3;
    }

    private AvlNode<T> rotateWithLeftChild(AvlNode<T> k4) {
        return k4;
    }

    private int compare(T x, T element) {
        if (cmp != null)
            return cmp.compare(x, element);
        else
            return ((Comparable) x).compareTo(element);
    }

}

