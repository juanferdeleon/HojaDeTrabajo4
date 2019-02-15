/**
 * List Factory
 * @author Juanfer De Leon
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
        } else if (listType.equals("L")){
            stack = new CircularList();
        }

        return stack;
    }
}
