public interface iLista<E> {

    int size();
    // post: returns number of elements in list

    boolean isEmpty();
    // post: returns true iff list has no elements

    //public void clear();
    // post: empties list

    void addLast(E value);
    // post: value is added to end of list

    E getLast();
    // pre: list is not empty
    // post: returns last value in list

    E removeLast();
    // pre: list is not empty
    // post: removes last value from list

    E peek();

}
