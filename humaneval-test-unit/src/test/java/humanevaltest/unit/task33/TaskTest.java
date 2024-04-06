package humanevaltest.unit.task33;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testSortThird_listWithLastIndexDivisibleByThree0_sortsOnlyIndicesDivisibleByThree() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 6, 3, 4, 8, 9, 2);
        List<Integer> expectedSortedElements = Arrays.asList(2, 6, 3, 4, 8, 9, 5);
        List<Integer> actualSortedElements = task.sortThird(l);
        assertEquals(expectedSortedElements, actualSortedElements);
    }

    @Test
    public void testSortThird_listWithLastIndexDivisibleByThree1_sortsOnlyIndicesDivisibleByThree() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 8, 3, 4, 6, 9, 2);
        List<Integer> expectedSortedElements = Arrays.asList(2, 8, 3, 4, 6, 9, 5);
        List<Integer> actualSortedElements = task.sortThird(l);
        assertEquals(expectedSortedElements, actualSortedElements);
    }

    @Test
    public void testSortThird_listWithLastIndexDivisibleByThree2_sortsOnlyIndicesDivisibleByThree() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 6, 9, 4, 8, 3, 2);
        List<Integer> expectedSortedElements = Arrays.asList(2, 6, 9, 4, 8, 3, 5);
        List<Integer> actualSortedElements = task.sortThird(l);
        assertEquals(expectedSortedElements, actualSortedElements);
    }

    @Test
    public void testSortThird_listWithLastIndexNotDivisibleByThree_sortsOnlyIndicesDivisibleByThree() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1);
        List<Integer> expectedSortedElements = Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1);
        List<Integer> actualSortedElements = task.sortThird(l);
        assertEquals(expectedSortedElements, actualSortedElements);
    }
}
