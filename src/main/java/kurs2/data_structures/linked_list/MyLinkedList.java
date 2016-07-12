package kurs2.data_structures.linked_list;

import java.util.*;

/**
 * Created by miha on 29.06.2016.
 */
public class MyLinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /******************************************************/
    @Override
    public int size() {
        return size;
    }

    /******************************************************/

    @Override
    public boolean isEmpty() {
        return size == 0;
        //return head == null; второй вариант реализации
    }

    /******************************************************/

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    /******************************************************/
    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c)
            if (!contains(o)) return false;
        return true;
    }


    @Override
    public boolean retainAll(Collection c) {
        if (c == null) throw new NullPointerException();
        MyLinkedList tmp = new MyLinkedList();
        for (Object o : this) {
            if (!c.contains(o))
                tmp.add(o);
        }
        removeAll(tmp);
        return false;

    }

    /******************************************************/
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }


    /*******************************************************************/
    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[size];
        int i = 0;
        for (Node<T> iter = head; iter != null; iter = iter.next)
            result[i++] = iter.value;
        return result;
    }

    /*******************************************************************/
    @Override
    public boolean add(Object o) {
        if (head == null) {
            head = tail = new Node(o);
            size++;
            return true;
        }

        Node newNode = new Node(tail, o);
        tail.next = newNode;
        tail = newNode;
        size++;
        ///add(size, (T) o); второй вариант реализации
        return true;
    }

    /*******************************************************************/
    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(element);

        if (size == 0) {
            head = tail = newNode;
            head.previous = null;
            head.next = null;
        }
        if (index == 0) {

            newNode.next = head;
            head.previous = newNode;
            head = newNode;

        } else if (index == size) {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            Node<T> findNode = findNode(index);
            newNode.next = findNode;
            newNode.previous = findNode.previous;
            findNode.previous.next = newNode;
            findNode.previous = newNode;
        }

        size++;

    }

    /*******************************************************************/
    @Override
    public boolean addAll(Collection c) {
        boolean result = false;
        for (Object o : c) {//перебираем коллекцию и добавляем поелементно
            result = add(o);
        }
        return result;


        // return addAll(size,c); вторая реализиция

    }

    /*******************************************************************/
    @Override
    public boolean addAll(int index, Collection c) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        for (Object o : c) {//перебираем коллекцию и добавляем поелементно
            add(index, (T) o);
            index++;
        }
        return false;
    }


    /*******************************************************************/
    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index != -1) {
            remove(indexOf(o));
            return true;
        } else return false;
    }

    /*******************************************************************/

    @Override
    public T remove(int index) {

        Node<T> iter = findNode(index);
        if (iter == head) {
            head = iter.next;
            if (iter.next == null) {
                head = tail = null;
            } else {
                head.previous = null;
                iter.next = null;
            }
        } else if (iter == tail) {
            tail = iter.previous;
            tail.next = null;
            iter.previous = null;

        } else {
//        previous-> me -> next --->  previous -> next
            iter.previous.next = iter.next;
//        previous<- me <- next ---> previous <- next
            iter.next.previous = iter.previous;
            iter.previous = null;
            iter.next = null;
        }
        size--;
        return iter.value;
    }

    /*******************************************************************/
    @Override
    public boolean removeAll(Collection c) {
        MyLinkedList tmp = new MyLinkedList();
        for (Object o : c) {//перебираем коллекцию и удаляем поелементно
            for (Object e : this) {
                if (o.equals(e)) {
                    tmp.add(o);
                }
            }
        }
        for (Object t : tmp) {
            remove(t);
        }
        return  tmp.size()!=0;
    }


    /*******************************************************************/

    //todo Exception
    @Override
    public T get(int index) {

        Node<T> iter = findNode(index);

        return iter.value;
    }

    /*******************************************************************/
    @Override
    public void clear() {
        Node<T> current = head;
        for (int i = 0; i < size - 1; i++) {
            Node<T> currentNext = current.next;
            current.previous = null;
            current.next = null;
            current.value = null;
            current = currentNext;
        }
        head = tail = null;
        size = 0;
    }

    /*******************************************************************/
    private Node<T> findNode(int index) {
        if (index >= size || index < 0) {
            throw new MyIndexOutOfBoundException(String.valueOf(index));
        }
        Node<T> iter = head;
        for (int i = 0; i < index; i++) {
            iter = iter.next;
        }
        return iter;
    }

    /*******************************************************************/

    @Override
    public T set(int index, T element) {

        Node<T> iter = findNode(index);
        T toReturn = iter.value;

        iter.value = element;

        return toReturn;
    }

    /*******************************************************************/


    @Override
    public int indexOf(Object o) {

        Node<T> iter = head;

        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (iter.value == null) return i;
                iter = iter.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(iter.value)) return i;
                iter = iter.next;
            }
        }
        return -1;
    }

    /*******************************************************************/
    @Override
    public int lastIndexOf(Object o) {
        Node<T> iter;
        int index = size;

        //если пришел пустой объект
        if (o == null) {
            for (iter = tail; iter != null; iter = iter.previous) {
                index--;
                if (iter.value == null) return index;
            }
        } else {
            for (iter = tail; iter != null; iter = iter.previous) {
                index--;
                if (o.equals(iter.value)) return index;
            }
        }
        return -1;
    }

    /*******************************************************************/
    @Override
    public ListIterator listIterator() {
//        NOP
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        //        NOP

        return null;
    }

    /**************************************************************************/
    @Override
    public List subList(int fromIndex, int toIndex) {
        // TODO: 10.07.2016
        // проверки индексов от 0 до size-1;

        //toIndex >= fromIndex


        MyLinkedList<T> sublist = new MyLinkedList<>();

        for (int i = fromIndex; i <= toIndex; i++) {
            sublist.add(findNode(i).value);
        }

        return sublist;
    }

    /**************************************************************************/


    @Override
    public Object[] toArray(Object[] a) {
        //        NOP
        return new Object[0];
    }


    private static class Node<T> {
        Node<T> next;
        Node<T> previous;
        T value;


        public Node() {
        }

        public Node(T value) {
            this.value = value;
        }

        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        public Node(Node<T> previous, T value) {
            this.previous = previous;
            this.value = value;
        }
    }

    private class MyIterator implements Iterator {

        Node<T> iterator;

        public MyIterator() {
            iterator = new Node<>();
            iterator.next = head;
        }

        @Override
        public boolean hasNext() {
            return iterator.next != null;
        }

        @Override
        public T next() {
            iterator = iterator.next;
            return iterator.value;
        }

        @Override
        public void remove() {

        }
    }
}
