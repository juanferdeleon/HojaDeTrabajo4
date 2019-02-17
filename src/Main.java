import java.io.*;
import java.util.Scanner;

public class Main {
    /**
     * Main method
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{

        Boolean whantsToContinue = true;

        Calculadora calculadora = Calculadora.getInstance();

        while (whantsToContinue){

            System.out.println(mainMenu());
            Scanner input = new Scanner(System.in);
            String op = input.next();

            iPila<Double> stack = null;
            StackFactory stackFactory = new StackFactory();

            switch (op){
                case "1":
                    stack = stackFactory.makeStack("AL", null);
                    stack = readFile(calculadora, stack);
                    break;
                case "2":
                    stack = stackFactory.makeStack("V", null);
                    stack = readFile(calculadora, stack);
                    break;
                case "3":
                    System.out.println(secondMenu());
                    Scanner input2 = new Scanner(System.in);
                    String op2 = input2.next();

                    switch (op2){
                        case "1":
                            stack = stackFactory.makeStack("L", "S");
                            stack = readFile(calculadora, stack);
                            break;
                        case "2":
                            stack = stackFactory.makeStack("L", "D");
                            stack = readFile(calculadora, stack);
                            break;
                        case "3":
                            stack = stackFactory.makeStack("L", "C");
                            stack = readFile(calculadora, stack);
                            break;
                        default:
                            System.out.println("La opcion ingresada no es valida.");
                    }

                    break;

                default:
                    System.out.println("La opcion ingresada no es valida");
            }

            System.out.println("El resultado de las operaciones es: " + stack.peek());

        }


    }

    /**
     * Metodo encargado de leer el archivo postfix y devolver el stack
     * @param calculadora
     * @param stack
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static iPila readFile(Calculadora calculadora, iPila stack) throws FileNotFoundException, IOException {

        File file = new File("../datos.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null){
            stack = calculadora.operar(line, stack);
        }

        return stack;
    }

    /**
     * Menu principal para elegir tipo de stack
     * @return
     */
    public static String mainMenu(){
        return "\tMenu\n" +
                "1. ArrayList\n" +
                "2. Vector\n" +
                "3. Lista\n" +
                "Implementacion deseada para el stack: ";
    }

    /**
     * Menu secundario para elegir tipo de lista
     * @return
     */
    public static String secondMenu(){
        return "\tMenu Implementacion de Lista\n" +
                "1. Simplemente encadenadas" +
                "2. Doblemente encadenadas" +
                "3. Lista circular" +
                "Implementacion deseada para la lista: ";
    }
}
