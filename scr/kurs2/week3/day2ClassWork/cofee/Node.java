package scr.kurs2.week3.day2ClassWork.cofee;

/**
 * Created by miha on 14.06.2016.
 */
public class Node {
    public Node next;
    public Node previous;
    Object value;

    public Node(Object value) {
        this.value = value;
    }

    public Node(Node next, Node previous, Object value) {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }

    public Node(Node previous, Object value) {
        this.previous = previous;
        this.value = value;
    }
}
