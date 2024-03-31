package humanevaltest.coverage.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testIntersperse_emptyList_interspersesNothingCorrectly() {
        Task task = new Task();
        List<Integer> numbers = List.of();
        int delimiter = 7;
        List<Integer> expectedInterspersedNumbers = List.of();
        List<Integer> actualInterspersedNumbers = task.intersperse(numbers, delimiter);
        assertEquals(expectedInterspersedNumbers, actualInterspersedNumbers);
    }

    @Test
    public void testIntersperse_nonEmptyListNotContainingDelimiter_interspersesCorrectly() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(5, 6, 3, 2);
        int delimiter = 8;
        List<Integer> expectedInterspersedNumbers = Arrays.asList(5, 8, 6, 8, 3, 8, 2);
        List<Integer> actualInterspersedNumbers = task.intersperse(numbers, delimiter);
        assertEquals(expectedInterspersedNumbers, actualInterspersedNumbers);
    }

    @Test
    public void testIntersperse_nonEmptyListContainingDelimiter_interspersesCorrectly() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(2, 2, 2);
        int delimiter = 2;
        List<Integer> expectedInterspersedNumbers = Arrays.asList(2, 2, 2, 2, 2);
        List<Integer> actualInterspersedNumbers = task.intersperse(numbers, delimiter);
        assertEquals(expectedInterspersedNumbers, actualInterspersedNumbers);
    }
}
