package humanevaltest.unit.task37;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testSortEven_sortedEvenIndices_returnsSameOrder() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> expectedSortedEvenIndices = Arrays.asList(1, 2, 3);
        List<Integer> actualSortedEvenIndices = task.sortEven(l);
        assertEquals(expectedSortedEvenIndices, actualSortedEvenIndices);
    }

    @Test
    public void testSortEven_unsortedEvenIndicesWithOddLength_returnsWithSortedEvenIndices() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        List<Integer> expectedSortedEvenIndices = Arrays.asList(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123);
        List<Integer> actualSortedEvenIndices = task.sortEven(l);
        assertEquals(expectedSortedEvenIndices, actualSortedEvenIndices);
    }

    @Test
    public void testSortEven_unsortedEvenIndicesWithEvenLength_returnsWithSortedEvenIndices() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
        List<Integer> expectedSortedEvenIndices = Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10);
        List<Integer> actualSortedEvenIndices = task.sortEven(l);
        assertEquals(expectedSortedEvenIndices, actualSortedEvenIndices);
    }
}
