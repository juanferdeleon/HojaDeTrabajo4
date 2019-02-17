/**
 * List Factory
 * @author Juanfer De Leon
 * @param <E>
 */
public class ListFactory<E> {

    /**
     * Specific list type is created
     * @param listType
     * @return Specific list type is returned
     */
    public iLista<E> makeList(String listType){

        iLista<E> stack = null;

        if (listType.equals("S")){
            stack = new SinglyLinkedList<>();
        } else if (listType.equals("D")){
            stack = new DoublyLinkedList<>();
        } else if (listType.equals("L")){
            stack = new CircularList<>();
        }

        return stack;
    }
}
