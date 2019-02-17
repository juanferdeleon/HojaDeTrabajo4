/**
 * Clase abstracta de Lista
 * @param <E> Dato Generico
 * @author Juanfer De Leon
 */
public abstract class AbstractList<E> implements iLista<E> {
    /**
     * An item is added to list
     * @param value
     */
    public abstract void addLast(E value);

    /**
     * The most recently pushed item is removed and returned
     * @return
     */
    public abstract E removeLast();
    // pre: list is not empty
    // post: removes last value from list and returns last value in list

    /**
     * The top value is returned
     * @return
     */
    public abstract E getLast();
    // pre: list is not empty
    // post: returns last value in list

    /**
     *returns the number of elements in the stack
     * @return
     */
    public abstract int size();
    // post: returns number of elements in list

}
