/**
 * La clase calculadora realiza los calculos de una expresion en formato postfix
 */
public class Calculadora {

    static double resultado;

    private static Calculadora firstInstance = null;

    /**
     * Calculator constructor
     * Is private due to we want to have only one
     * instance of it
     */
    private Calculadora(){}

    /**
     * Method that checks if it already exists
     * an instance of the object Calculadora
     * @return the instance
     */
    public static Calculadora getInstance(){

        if (firstInstance == null){
            firstInstance = new Calculadora();
        }

        return firstInstance;
    }

    /**
     * Método para hacer la suma de la calculadora
     *
     * @param a double - sumando
     * @param b double - sumando
     * @return - El resultado de la suma de a y b
     */
    public static double sumar(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    /**
     * Método para hacer la resta de la calculadora
     *
     * @param a double -
     * @param b double -
     * @return double - El resultado de la resta entre a y b
     */
    public static double restar(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    /**
     * Método para hacer la multiplicación de la calculadora
     *
     * @param a double - factor
     * @param b double - factor
     * @return double - El resultado de la multiplicación entre a y b
     */
    public static double multiplicar(double a, double b) {
        resultado = a * b;
        return resultado;
    }

    /**
     * Método para hacer la división de la calculadora
     *
     * @param a double - dividendo
     * @param b double - divisor
     * @return double - El resultado de la división entre a y b
     */
    public static double dividir(double a, double b) {
        resultado = a / b;
        return resultado;
    }

    /**
     * Method that evaluates postfix text
     * @param postfixText postfix text
     * @param stack selected stack
     * @return stack with final answer
     */
    public static iPila<Double> operar(String postfixText, iPila<Double> stack){

        for (int position = 0; position < postfixText.length(); ++position){

            char caracter = postfixText.charAt(position);

            if (Character.isLetter(caracter)){

                System.out.println("ERROR: El archivo contiene un caracter");
                break;

            }

            if (Character.isDigit(caracter)){

                stack.push((double)Character.digit(caracter, 10));

            } else if (String.valueOf(caracter).matches("[+]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = sumar(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[-]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = restar(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[*]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = multiplicar(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[/]") && stack.peek() != 0.0D){

                double a = stack.pop();
                double b = stack.pop();
                double sum = dividir(b, a);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[/]") && stack.peek() == 0.0D){

                System.out.println("ERROR: Se intenta realizar una division dentro de cero.");
                break;
            }
        }

        return stack;
    }

}