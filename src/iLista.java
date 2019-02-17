/**
 * Interfaz iLista
 * @param <E> Dato Generico
 * @author Juanfer De Leon
 */
public interface iLista<E> {

    /**
     * An item is added to list
     * @param value
     */
    void addLast(E value);

    /**
     * The most recently pushed item is removed and returned
     * @return
     */
    E removeLast();
    // pre: list is not empty
    // post: removes last value from list and returns last value in list

    /**
     * The top value is returned
     * @return
     */
    E getLast();
    // pre: list is not empty
    // post: returns last value in list

    /**
     *returns the number of elements in the stack
     * @return
     */
//    int size();
//    // post: returns number of elements in list

}
