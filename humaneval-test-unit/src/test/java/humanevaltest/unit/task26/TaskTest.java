package humanevaltest.unit.task26;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testRemoveDuplicates_emptyList_returnsSameEmptyList() {
        Task task = new Task();
        List<Integer> numbers = List.of();
        List<Integer> expectedUniqueNumbers = List.of();
        List<Integer> actualUniqueNumbers = task.removeDuplicates(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }

    @Test
    public void testRemoveDuplicates_uniqueNumbers_returnsSameUniqueNumbers() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedUniqueNumbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> actualUniqueNumbers = task.removeDuplicates(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }

    @Test
    public void testRemoveDuplicates_duplicateNumbers_returnsUniqueNumbers() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        List<Integer> expectedUniqueNumbers = Arrays.asList(1, 4, 5);
        List<Integer> actualUniqueNumbers = task.removeDuplicates(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }
}
