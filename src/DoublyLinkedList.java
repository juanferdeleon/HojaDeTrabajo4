import java.util.NoSuchElementException;

/**
 * DoublyLinkedList
 * @param <E>
 * @author Juanfer De Leon
 */
public class DoublyLinkedList<E> extends AbstractList<E>{

    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList() {
        size = 0;
    }
    /**
     * this class keeps track of each element information
     * @author java2novice
     *
     */
    private class Node {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * Gets last element on the list
     * @return
     */
    public E getLast(){
        return tail.element;
    }


    /**
     * returns the size of the linked list
     * @return
     */
    public int size() { return size; }

    /**
     * return whether the list is empty or not
     * @return
     */
    public boolean isEmpty() { return size == 0; }

    /**
     * adds element at the end of the linked list
     * @param element
     */
    public void addLast(E element) {

        Node tmp = new Node(element, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
        System.out.println("adding: "+element);
    }

    /**
     * this method removes element from the end of the linked list
     * @return
     */
    public E removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }
}





