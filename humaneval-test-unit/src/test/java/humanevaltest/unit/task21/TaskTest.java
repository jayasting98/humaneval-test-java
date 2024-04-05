package humanevaltest.unit.task21;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testRescaleToUnit_twoIncreasingNumbers_returns0And1() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(2.0, 49.9);
        List<Double> expectedRescaledNumbers = Arrays.asList(0.0, 1.0);
        List<Double> actualRescaledNumbers = task.rescaleToUnit(numbers);
        assertEquals(expectedRescaledNumbers, actualRescaledNumbers);
    }

    @Test
    public void testRescaleToUnit_twoDecreasingNumbers_returns1And0() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(100.0, 49.9);
        List<Double> expectedRescaledNumbers = Arrays.asList(1.0, 0.0);
        List<Double> actualRescaledNumbers = task.rescaleToUnit(numbers);
        assertEquals(expectedRescaledNumbers, actualRescaledNumbers);
    }

    @Test
    public void testRescaleToUnit_moreThanTwoIncreasingNumbers_returnsRescaledIncreasingNumbers() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expectedRescaledNumbers = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
        List<Double> actualRescaledNumbers = task.rescaleToUnit(numbers);
        assertEquals(expectedRescaledNumbers, actualRescaledNumbers);
    }

    @Test
    public void testRescaleToUnit_moreThanTwoUnsortedNumbers_returnsRescaledNumbersInSameOrder() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(2.0, 1.0, 5.0, 3.0, 4.0);
        List<Double> expectedRescaledNumbers = Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75);
        List<Double> actualRescaledNumbers = task.rescaleToUnit(numbers);
        assertEquals(expectedRescaledNumbers, actualRescaledNumbers);
    }

    @Test
    public void testRescaleToUnit_numbersWithArbitraryMinimum_returnsRescaledNumbersInSameOrder() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(12.0, 11.0, 15.0, 13.0, 14.0);
        List<Double> expectedRescaledNumbers = Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75);
        List<Double> actualRescaledNumbers = task.rescaleToUnit(numbers);
        assertEquals(expectedRescaledNumbers, actualRescaledNumbers);
    }
}
