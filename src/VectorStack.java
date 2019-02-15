import java.util.Vector;

public class VectorStack<E> extends AbstractStack<E> {

    /**
     * la varaiable stack es el Vector que almacenara la informacion
     */
    protected Vector<E> stack = new Vector<>();

    /**
     * Un item es agregado al arreglo en su ultima posicion
     * @param item
     */
    public void push(E item){
        //pre:
        //post: item is added to the stack
        this.stack.addElement(item);
    }

    /**
     * El ultimo item en el arreglo es removido
     * @return devuelve el item removido
     */
    public E pop(){
        // pre: stack should not be empty
        // post: last pushed item is removed and returned
        return this.stack.remove(stack.size() - 1);
    }

    /**
     * Toma el ultimo item del arreglo
     * @return devuelve el ultimo item sin modificar el arreglo
     */
    public E peek(){
        //pre: stack should not be empty
        //post: last pushed item is returned
        return this.stack.get(stack.size() - 1);
    }

    /**
     * Verifica si el arreglo esta vacio
     * @return devuelve verdadero si esta vacio
     */
    public boolean empty(){
        //pre:
        //post: return true if empty
        if (stack != null){
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
