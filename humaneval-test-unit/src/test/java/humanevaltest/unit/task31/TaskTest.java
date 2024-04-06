package humanevaltest.unit.task31;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testIsPrime_one_returnsFalse() {
        Task task = new Task();
        assertFalse(task.isPrime(1));
    }

    @Test
    public void testIsPrime_compositeNumber_returnsFalse() {
        Task task = new Task();
        assertFalse(task.isPrime(6));
        assertFalse(task.isPrime(4));
        assertFalse(task.isPrime(5 * 17));
        assertFalse(task.isPrime(11 * 7));
        assertFalse(task.isPrime(13441 * 19));
    }

    @Test
    public void testIsPrime_primeNumber_returnsTrue() {
        Task task = new Task();
        assertTrue(task.isPrime(101));
        assertTrue(task.isPrime(11));
        assertTrue(task.isPrime(13441));
        assertTrue(task.isPrime(61));
        assertTrue(task.isPrime(5));
        assertTrue(task.isPrime(11));
        assertTrue(task.isPrime(17));
    }
}
