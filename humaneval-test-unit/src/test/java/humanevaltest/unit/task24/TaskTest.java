package humanevaltest.unit.task24;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testLargestDivisor_prime0_finds1() {
        Task task = new Task();
        int n = 3;
        int expectedLargestDivisor = 1;
        int actualLargestDivisor = task.largestDivisor(n);
        assertEquals(expectedLargestDivisor, actualLargestDivisor);
    }

    @Test
    public void testLargestDivisor_prime1_finds1() {
        Task task = new Task();
        int n = 7;
        int expectedLargestDivisor = 1;
        int actualLargestDivisor = task.largestDivisor(n);
        assertEquals(expectedLargestDivisor, actualLargestDivisor);
    }

    @Test
    public void testLargestDivisor_nonPrime0_findsLargestDivisor() {
        Task task = new Task();
        int n = 10;
        int expectedLargestDivisor = 5;
        int actualLargestDivisor = task.largestDivisor(n);
        assertEquals(expectedLargestDivisor, actualLargestDivisor);
    }

    @Test
    public void testLargestDivisor_nonPrime1_findsLargestDivisor() {
        Task task = new Task();
        int n = 100;
        int expectedLargestDivisor = 50;
        int actualLargestDivisor = task.largestDivisor(n);
        assertEquals(expectedLargestDivisor, actualLargestDivisor);
    }

    @Test
    public void testLargestDivisor_nonPrime2_findsLargestDivisor() {
        Task task = new Task();
        int n = 49;
        int expectedLargestDivisor = 7;
        int actualLargestDivisor = task.largestDivisor(n);
        assertEquals(expectedLargestDivisor, actualLargestDivisor);
    }
}
