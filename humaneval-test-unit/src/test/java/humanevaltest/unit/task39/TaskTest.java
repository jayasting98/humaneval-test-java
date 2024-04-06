package humanevaltest.unit.task39;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testPrimeFib_noEarlierPrimeFibonacciNumbers_returnsFibonacciNumber() {
        Task task = new Task();
        assertEquals(2, task.primeFib(1));
        assertEquals(3, task.primeFib(2));
        assertEquals(5, task.primeFib(3));
    }

    @Test
    public void testPrimeFib_someEarlierPrimeFibonacciNumbers_returnsPrimeFibonacciNumber() {
        Task task = new Task();
        assertEquals(13, task.primeFib(4));
        assertEquals(89, task.primeFib(5));
        assertEquals(233, task.primeFib(6));
        assertEquals(1597, task.primeFib(7));
        assertEquals(28657, task.primeFib(8));
        assertEquals(514229, task.primeFib(9));
        assertEquals(433494437, task.primeFib(10));
    }
}
