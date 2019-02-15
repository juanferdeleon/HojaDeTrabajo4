/**
 * Interface iPila
 * @param <E> Dato generico
 * @author Juanfer De Leon
 */
public interface iPila<E> {
    /**
     * An item is added to stack
     * @param item
     */
    void push(E item);

    /**
     * The most recently pushed item is removed and returned
     * @return
     */
    E pop();


    /**
     * The top value is returned
     * @return
     */
    E peek();

    /**
     * returns true if and only if the stack is empty
     * @return
     */
    boolean empty();

    /**
     * returns the number of elements in the stack
     * @return
     */
    int size();
}
