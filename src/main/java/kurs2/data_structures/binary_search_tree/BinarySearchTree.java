package kurs2.data_structures.binary_search_tree;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;

/**
 * Created by miha on 04.07.2016.
 */
public class BinarySearchTree<E> extends AbstractSet<E> implements NavigableSet<E>, Iterable<E> {


    private Node<E> root;
    private int size;
    private Comparator<? super E> comparator;

    public BinarySearchTree(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    public BinarySearchTree() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /************************************************************************************************/
    @Override
    public boolean contains(Object o) {

        Node<E> search = null;

        if (comparator != null) {
            //todo search with comparator
            //search with Comparable
        } else {

            search = findNode(o);

        }
        return search != null;
    }

    /************************************************************************************************/
    private Node<E> findNode(Object o) {
        if (o == null) throw new NullPointerException();
        Node<E> iterator = root;
        int compare;
        @SuppressWarnings("unchecked")
        Comparable<? super E> comparable = (Comparable<? super E>) o;
        while (iterator != null) {
            compare = comparable.compareTo(iterator.value);
            if (compare > 0) iterator = iterator.rightChild;
            else if (compare < 0) iterator = iterator.leftChild;
            else return iterator;
        }
        return null;
    }

    /************************************************************************************************/

    @Override
    public E lower(E e) {
        return null;
    }

    @Override
    public E floor(E e) {
        return null;
    }

    @Override
    public E ceiling(E e) {
        return null;
    }

    @Override
    public E higher(E e) {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }


    public void showTree(){
        //делаем через рекурсию
        // 1е правило выхода
        deepSearch(root);

    }

    private void deepSearch(Node<E> root) {
        //exit
        //находим меншего за root
        deepSearch(root.leftChild);
        // выводим найменьшее значение
        System.out.println(root.value);
        //
        deepSearch(root.rightChild);

    }


    @Override
    public E pollLast() {
        return null;
    }


    @Override
    public Iterator<E> iterator() {
        return new MyBinaryTreeIterator();
    }

    @Override
    public NavigableSet<E> descendingSet() {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    @Override
    public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return null;
    }

    @Override
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
        return null;
    }

    @Override
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        return null;
    }

    @Override
    public Comparator<? super E> comparator() {
        return null;
    }

    @Override
    public SortedSet<E> subSet(E fromElement, E toElement) {
        return null;
    }

    @Override
    public SortedSet<E> headSet(E toElement) {
        return null;
    }

    @Override
    public SortedSet<E> tailSet(E fromElement) {
        return null;
    }

    /**************************************************************************/
    @Override
    public E first() {
        if (isEmpty()) throw new NoSuchElementException("size == 0");
        Node<E> iter = root;
        return findLeft(iter);
    }

    /**************************************************************************/
    private E findLeft(Node<E> iter) {
        return iter.leftChild != null ? findLeft(iter.leftChild) : iter.value;
    }


    /**************************************************************************/
    @Override
    public E last() {
        if (isEmpty()) throw new NoSuchElementException("size == 0");
        Node<E> iter = root;
        return findRight(iter);
    }

    private E findRight(Node<E> iter) {
        return iter.rightChild != null ? findRight(iter.rightChild) : iter.value;

    }

    /**************************************************************************/


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /************************************************************************************************/
    @Override
    public boolean add(E e) {

        if (root == null) {
            canCompare(e, e);
            root = new Node<>(e);
            size++;
            return true;
        } else if (comparator != null) {
            // todo compare with comparator
        } else {

            @SuppressWarnings("unchecked")
            Comparable<? super E> eComparable = (Comparable<? super E>) e;

            Node<E> iterator = root;
            Node<E> parent;
            int compareResult;

            do {
                parent = iterator;
                compareResult = eComparable.compareTo(iterator.value);
                if (compareResult > 0) {
                    iterator = iterator.rightChild;
                } else if (compareResult < 0) {
                    iterator = iterator.leftChild;
                } else {
                    return false;
                }
            } while (iterator != null);

            if (compareResult > 0) {
                parent.rightChild = new Node<E>(e, parent);
            } else {
                parent.leftChild = new Node<E>(e, parent);
            }
            size++;
            return true;
        }
        return false;
    }

    /************************************************************************************************/

    @SuppressWarnings("unchecked")
    private int canCompare(E element1, E element2) {
        return comparator != null ? comparator.compare(element1, element2) :
                ((Comparable<? super E>) element1).compareTo(element2);
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    /************************************************************************************************/
    @Override
    public boolean remove(Object o) {

        Node<E> current = findNode(o);
        if (current == null) return false;
        size--;

        if (current.rightChild == null && current.leftChild == null) {//doesn't have children
            if (current == root) root = null;
            else if (current == current.parrent.leftChild) current.parrent.leftChild = null;
            else current.parrent.rightChild = null;

            current.parrent = null;


        } else if (current.rightChild == null) {//has only left child
            if (current == root) {
                root = current.leftChild;
                root.parrent = null;
            } else if (current == current.parrent.leftChild) {
                current.parrent.leftChild = current.leftChild;
                current.leftChild.parrent = current.parrent;
                current.parrent = null;
            } else {
                current.parrent.rightChild = current.leftChild;
                current.leftChild.parrent = current.parrent;
                current.parrent = null;
            }
            current.leftChild = null;


        } else if (current.leftChild == null) {//has only right child
            if (current == root) {
                root = current.rightChild;
                root.parrent = null;
            } else if (current == current.parrent.leftChild) {
                current.parrent.leftChild = current.rightChild;
                current.rightChild.parrent = current.parrent;
                current.parrent = null;
            } else {
                current.parrent.rightChild = current.rightChild;
                current.rightChild.parrent = current.parrent;
                current.parrent = null;
            }
            current.leftChild = null;
        } else {//has both children

            Node<E> successor = findSuccessor(current);
            if (current == root){
                root = successor;
            } else if (current.parrent.leftChild == current){
                current.parrent.leftChild = successor;
            }else {
                current.parrent.rightChild = successor;
            }
            successor.parrent = current.parrent;
            successor.leftChild = current.leftChild;
            current.leftChild.parrent = successor;
        }


        return true;
    }

    private Node<E> findSuccessor(Node<E> current) {
        Node<E> successor = current.rightChild;
        while (successor.leftChild != null) {
            successor = successor.leftChild;
        }
        if (successor.parrent != current) {
            successor.parrent.leftChild = successor.rightChild;
            successor.rightChild.parrent = successor.parrent;
            successor.rightChild = current.rightChild;
            current.rightChild.parrent = successor;
        }
        return successor;
    }

    /************************************************************************************************/

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    private static class Node<T> {
        T value;
        Node<T> parrent;
        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> parent) {
            this.value = value;
            this.parrent = parent;
        }
    }

    private class MyBinaryTreeIterator implements Iterator<E> {


        // TODO: 09.07.2016
        Node<E> iterator;
        public  MyBinaryTreeIterator(){
            this.iterator = findLeftNode(root);
        }

        private Node<E> findLeftNode(Node<E> root) {
            return  null;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }


    }
}
