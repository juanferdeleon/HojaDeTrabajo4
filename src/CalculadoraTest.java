import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        double result = Calculadora.sumar(1, 3);
        assertEquals(4, result);
    }

    @org.junit.jupiter.api.Test
    void restar() {
        double result = Calculadora.restar(1, 3);
        assertEquals(4, result);
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        double result = Calculadora.sumar(1, 3);
        assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        double result = Calculadora.sumar(1, 3);
        assertEquals(4, result);
    }
}