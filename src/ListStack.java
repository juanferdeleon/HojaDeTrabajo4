/**
 *
 * @param <E> Dato Generico
 * @author Juanfer De Leon
 */
public class ListStack<E> extends AbstractStack<E>{
    protected iLista<E> stack;

    ListStack(String listType){
        ListFactory listFactory = new ListFactory();
        stack = listFactory.makeList(listType);
    }

    /**
     * An item is added to stack
     * @param item
     */
    public void push(E item){
        //pre:
        //post: item is added to the stack
        this.stack.addLast(item);
    }

    /**
     * El ultimo item en el arreglo es removido
     * @return devuelve el item removido
     */
    public E pop() {
        // pre: stack should not be empty
        // post: last pushed item is removed and returned
        return this.stack.removeLast();
    }

    /**
     * Toma el ultimo item del arreglo
     * @return el ultimo item del arreglo
     */
    public E peek() {
        //pre: stack should not be empty
        //post: last pushed item is returned
        return stack.getLast();
    }

    /**
     * Verifica si el arreglo esta vacio
     * @return devuelve verdadero si esta vacio
     */
    public boolean empty(){
        //pre:
        //post: return true if empty
        if (this.stack != null){
            return false;
        }
        return true;
    }

    /**
     * Indica el tamaño del arreglo
     * @return devuelve el tamaño
     */
    public int size(){
        //pre:
        //post: return the size of the stack
        return this.stack.size();
    }
}
