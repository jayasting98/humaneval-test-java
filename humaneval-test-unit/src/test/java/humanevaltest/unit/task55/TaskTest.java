package humanevaltest.unit.task55;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFib_nLargerThanOne0_calculatesCorrectly() {
        Task task = new Task();
        int n = 10;
        int expectedFibonacciNumber = 55;
        int actualFibonacciNumber = task.fib(n);
        assertEquals(expectedFibonacciNumber, actualFibonacciNumber);
    }

    @Test
    public void testFib_nEqualsOne_calculates1() {
        Task task = new Task();
        int n = 1;
        int expectedFibonacciNumber = 1;
        int actualFibonacciNumber = task.fib(n);
        assertEquals(expectedFibonacciNumber, actualFibonacciNumber);
    }

    @Test
    public void testFib_nLargerThanOne1_calculatesCorrectly() {
        Task task = new Task();
        int n = 8;
        int expectedFibonacciNumber = 21;
        int actualFibonacciNumber = task.fib(n);
        assertEquals(expectedFibonacciNumber, actualFibonacciNumber);
    }

    @Test
    public void testFib_nLargerThanOne2_calculatesCorrectly() {
        Task task = new Task();
        int n = 11;
        int expectedFibonacciNumber = 89;
        int actualFibonacciNumber = task.fib(n);
        assertEquals(expectedFibonacciNumber, actualFibonacciNumber);
    }

    @Test
    public void testFib_nLargerThanOne3_calculatesCorrectly() {
        Task task = new Task();
        int n = 12;
        int expectedFibonacciNumber = 144;
        int actualFibonacciNumber = task.fib(n);
        assertEquals(expectedFibonacciNumber, actualFibonacciNumber);
    }
}
