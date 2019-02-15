/**
 * Clase abstracta de la Pila
 * @author Juanfer De Leon
 */
public abstract class AbstractStack<E> implements iPila<E>{

    /**
     * An item is added to stack
     * @param item
     */
    public abstract void push(E item);

    /**
     * The most recently pushed item is removed and returned
     * @return
     */
    public abstract E pop();

    /**
     * The top value (next to be popped) is returned
     * @return
     */
    public abstract E peek();

    /**
     * returns true if and only if the stack is empty
     * @return
     */
    public abstract boolean empty();

    /**
     * returns the number of elements in the stack
     * @return
     */
    public abstract int size();

}
