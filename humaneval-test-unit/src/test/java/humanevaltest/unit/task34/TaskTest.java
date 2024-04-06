package humanevaltest.unit.task34;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testUnique_typicalNumbers_removesDuplicates() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expectedUniqueNumbers = Arrays.asList(0, 2, 3, 5, 9, 123);
        List<Integer> actualUniqueNumbers = task.unique(l);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }
}
