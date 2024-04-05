package humanevaltest.unit.task13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testGreatestCommonDivisor_primes_returns1() {
        Task task = new Task();
        int a = 3;
        int b = 7;
        int expectedDivisor = 1;
        int actualDivisor = task.greatestCommonDivisor(a, b);
        assertEquals(expectedDivisor, actualDivisor);
    }

    @Test
    public void testGreatestCommonDivisor_nonCoPrimes0_returnsMoreThan1() {
        Task task = new Task();
        int a = 10;
        int b = 15;
        int expectedDivisor = 5;
        int actualDivisor = task.greatestCommonDivisor(a, b);
        assertEquals(expectedDivisor, actualDivisor);
    }

    @Test
    public void testGreatestCommonDivisor_nonCoPrimes1_returnsMoreThan1() {
        Task task = new Task();
        int a = 49;
        int b = 14;
        int expectedDivisor = 7;
        int actualDivisor = task.greatestCommonDivisor(a, b);
        assertEquals(expectedDivisor, actualDivisor);
    }

    @Test
    public void testGreatestCommonDivisor_nonCoPrimes2_returnsMoreThan1() {
        Task task = new Task();
        int a = 144;
        int b = 60;
        int expectedDivisor = 12;
        int actualDivisor = task.greatestCommonDivisor(a, b);
        assertEquals(expectedDivisor, actualDivisor);
    }
}
