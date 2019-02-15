/**
 * List Factory
 */
public class ListFactory {

    /**
     * Specific list type is created
     * @param listType
     * @return Specific list type is returned
     */
    public iLista makeList(String listType){

        iLista stack = null;

        if (listType.equals("S")){
            stack = new SinglyLinkedList();
        } else if (listType.equals("D")){
            stack = new DoublyLinkedList();
        } else {
            stack = new CircularList();
        }

        return stack;
    }
}
