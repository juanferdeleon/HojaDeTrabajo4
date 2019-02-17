import java.util.Scanner;

/**
 * Stack Factory
 * @author Juanfer De Leon
 */
public class StackFactory {

    /**
     * Specific stack type is created
     * @param stackType
     * @return Specific stack type is returned
     */
    public iPila makeStack(String stackType, String listType){

        iPila stack = null;

        if (stackType.equals("AL")){
            stack = new ArrayListStack();
        } else if (stackType.equals("V")){
            stack = new VectorStack();
        } else if(stackType.equals("L")){
            stack = new ListStack(listType);
        }

        return stack;

    }
}
