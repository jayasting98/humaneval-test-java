package humanevaltest.unit.task59;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testLargestPrimeFactor_distinctPrimeFactors0_returnsLargestPrimeFactor() {
        Task task = new Task();
        int n = 15;
        int expectedLargestPrimeFactor = 5;
        int actualLargestPrimeFactor = task.largestPrimeFactor(n);
        assertEquals(expectedLargestPrimeFactor, actualLargestPrimeFactor);
    }

    @Test
    public void testLargestPrimeFactor_cubedPrime_returnsPrime() {
        Task task = new Task();
        int n = 27;
        int expectedLargestPrimeFactor = 3;
        int actualLargestPrimeFactor = task.largestPrimeFactor(n);
        assertEquals(expectedLargestPrimeFactor, actualLargestPrimeFactor);
    }

    @Test
    public void testLargestPrimeFactor_squaredSmallerPrime_returnsLargestPrimeFactor() {
        Task task = new Task();
        int n = 63;
        int expectedLargestPrimeFactor = 7;
        int actualLargestPrimeFactor = task.largestPrimeFactor(n);
        assertEquals(expectedLargestPrimeFactor, actualLargestPrimeFactor);
    }

    @Test
    public void testLargestPrimeFactor_distinctPrimeFactors1_returnsLargestPrimeFactor() {
        Task task = new Task();
        int n = 330;
        int expectedLargestPrimeFactor = 11;
        int actualLargestPrimeFactor = task.largestPrimeFactor(n);
        assertEquals(expectedLargestPrimeFactor, actualLargestPrimeFactor);
    }

    @Test
    public void testLargestPrimeFactor_distinctPrimeFactors2_returnsLargestPrimeFactor() {
        Task task = new Task();
        int n = 13195;
        int expectedLargestPrimeFactor = 29;
        int actualLargestPrimeFactor = task.largestPrimeFactor(n);
        assertEquals(expectedLargestPrimeFactor, actualLargestPrimeFactor);
    }
}
