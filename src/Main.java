import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{

        Boolean whantsToContinue = true;

        Calculadora calculadora = Calculadora.getInstance();

        while (whantsToContinue){

            System.out.println(mainMenu());
            Scanner input = new Scanner(System.in);
            String op = input.next();

            iPila<Double> stack;
            StackFactory stackFactory = new StackFactory();
            ListFactory listFactory = new ListFactory();

            switch (op){
                case "1":
                    stack = stackFactory.makeStack("AL");
                    stack = readFile(calculadora, stack);
                    break;
                case "2":
                    stack = stackFactory.makeStack("V");
                    stack = readFile(calculadora, stack);
                    break;
                case "3":
                    System.out.println(secondMenu());
                    Scanner input2 = new Scanner(System.in);
                    String op2 = input.next();

                    switch (op2){
                        case "1":
                            stack = stackFactory.makeStack("L");
                    }
            }
        }


    }

    public static iPila readFile(Calculadora calculadora, iPila stack) throws FileNotFoundException, IOException {

        File file = new File("../numeros.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null){
            stack = Calculadora.operar(line, stack);
        }

        return stack;
    }

    public static String mainMenu(){
        return "\tMenu\n" +
                "1. ArrayList\n" +
                "2. Vector\n" +
                "3. Lista\n" +
                "Implementacion deseada para el stack: ";
    }

    public static String secondMenu(){
        return "\tMenu Implementacion de Lista\n" +
                "1. Simplemente encadenadas" +
                "2. Doblemente encadenadas" +
                "3. Lista circular" +
                "Implementacion deseada para la lista: ";
    }
}
