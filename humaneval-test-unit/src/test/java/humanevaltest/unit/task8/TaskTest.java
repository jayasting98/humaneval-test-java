package humanevaltest.unit.task8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testSumProduct_emptyList_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> numbers = List.of();
        List<Integer> expectedValues = Arrays.asList(0, 1);
        List<Integer> actualValues = task.sumProduct(numbers);
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testSumProduct_allOne_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 1, 1);
        List<Integer> expectedValues = Arrays.asList(3, 1);
        List<Integer> actualValues = task.sumProduct(numbers);
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testSumProduct_hasZero_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(100, 0);
        List<Integer> expectedValues = Arrays.asList(100, 0);
        List<Integer> actualValues = task.sumProduct(numbers);
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testSumProduct_nonSpecialNumbers_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(3, 5, 7);
        List<Integer> expectedValues = Arrays.asList(3 + 5 + 7, 3 * 5 * 7);
        List<Integer> actualValues = task.sumProduct(numbers);
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testSumProduct_oneNumber_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> numbers = List.of(10);
        List<Integer> expectedValues = Arrays.asList(10, 10);
        List<Integer> actualValues = task.sumProduct(numbers);
        assertEquals(expectedValues, actualValues);
    }
}
