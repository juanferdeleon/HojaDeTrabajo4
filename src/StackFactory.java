/**
 * Stack Factory
 * @author Juanfer De Leon
 */
public class StackFactory<E> {

    /**
     * Specific stack type is created
     * @param stackType
     * @return Specific stack type is returned
     */
    public iPila<E> makeStack(String stackType){

        iPila<E> stack = null;

        if (stackType.equals("AL")){
            stack = new ArrayListStack<>();
        } else if (stackType.equals("V")){
            stack = new VectorStack<>();
        } else if(stackType.equals("L")){
            stack = new ListStack<>();
        }

        return stack;

    }
}
