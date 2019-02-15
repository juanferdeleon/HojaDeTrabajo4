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

    E remove();
    // pre: list has at least one element
    // post: removes last value found in list

    E get();
    // pre: list has at least one element
    // post: returns last value found in list

    E peek();
    
}
