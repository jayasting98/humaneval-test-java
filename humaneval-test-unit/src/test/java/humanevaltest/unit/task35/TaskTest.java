package humanevaltest.unit.task35;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testMaxElement_increasingList_returnsLastElement() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 2, 3);
        int expectedMax = 3;
        int actualMax = task.maxElement(l);
        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void testMaxElement_unorderedList_returnsMax() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
        int expectedMax = 124;
        int actualMax = task.maxElement(l);
        assertEquals(expectedMax, actualMax);
    }
}
