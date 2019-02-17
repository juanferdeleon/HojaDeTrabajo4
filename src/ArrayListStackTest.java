import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListStackTest {

    @Test
    void pop() {
        ArrayListStack<Integer> result = new ArrayListStack<>();
        result.push(2);

        assertEquals(2, result.pop());

    }

    @Test
    void peek() {
        ArrayListStack<Integer> result = new ArrayListStack<>();
        result.push(2);

        assertEquals(4, result.peek());
    }

    @Test
    void size() {
        ArrayListStack<Integer> result = new ArrayListStack<>();
        result.push(2);

        assertEquals(1, result.size());
    }
}