package humanevaltest.unit.task25;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFactorize_prime_returnsOnlyPrime() {
        Task task = new Task();
        int n = 2;
        List<Integer> expectedFactors = List.of(2);
        List<Integer> actualFactors = task.factorize(n);
        assertEquals(expectedFactors, actualFactors);
    }

    @Test
    public void testFactorize_squaredPrime_returnsPrimeTwice() {
        Task task = new Task();
        int n = 4;
        List<Integer> expectedFactors = Arrays.asList(2, 2);
        List<Integer> actualFactors = task.factorize(n);
        assertEquals(expectedFactors, actualFactors);
    }

    @Test
    public void testFactorize_cubedPrime_returnsPrimeThrice() {
        Task task = new Task();
        int n = 8;
        List<Integer> expectedFactors = Arrays.asList(2, 2, 2);
        List<Integer> actualFactors = task.factorize(n);
        assertEquals(expectedFactors, actualFactors);
    }

    @Test
    public void testFactorize_productOfPrimes_returnsEachPrime() {
        Task task = new Task();
        int n = 3 * 19;
        List<Integer> expectedFactors = Arrays.asList(3, 19);
        List<Integer> actualFactors = task.factorize(n);
        assertEquals(expectedFactors, actualFactors);
    }

    @Test
    public void testFactorize_squaredProductOfPrimes_returnsEachPrimeTwice() {
        Task task = new Task();
        int n = 3 * 19 * 3 * 19;
        List<Integer> expectedFactors = Arrays.asList(3, 3, 19, 19);
        List<Integer> actualFactors = task.factorize(n);
        assertEquals(expectedFactors, actualFactors);
    }

    @Test
    public void testFactorize_cubedProductOfPrimes_returnsEachPrimeThrice() {
        Task task = new Task();
        int n = 3 * 19 * 3 * 19 * 3 * 19;
        List<Integer> expectedFactors = Arrays.asList( 3, 3, 3, 19, 19, 19);
        List<Integer> actualFactors = task.factorize(n);
        assertEquals(expectedFactors, actualFactors);
    }

    @Test
    public void testFactorize_primeProduct0_factorizesCorrectly() {
        Task task = new Task();
        int n = 3 * 19 * 19 * 19;
        List<Integer> expectedFactors = Arrays.asList(3, 19, 19, 19);
        List<Integer> actualFactors = task.factorize(n);
        assertEquals(expectedFactors, actualFactors);
    }

    @Test
    public void testFactorize_primeProduct1_factorizesCorrectly() {
        Task task = new Task();
        int n = 3 * 2 * 3;
        List<Integer> expectedFactors = Arrays.asList(2, 3, 3);
        List<Integer> actualFactors = task.factorize(n);
        assertEquals(expectedFactors, actualFactors);
    }
}
