package humanevaltest.unit.task22;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFilterIntegers_emptyValues_filtersNothing() {
        Task task = new Task();
        List<Object> values = List.of();
        List<Integer> expectedIntegers = List.of();
        List<Integer> actualIntegers = task.filterIntegers(values);
        assertEquals(expectedIntegers, actualIntegers);
    }

    @Test
    public void testFilterIntegers_multipleTypes_filtersIntegers() {
        Task task = new Task();
        List<Object> values = Arrays.asList(4, Map.of(), List.of(), 23.2, 9, "adasd");
        List<Integer> expectedIntegers = Arrays.asList(4, 9);
        List<Integer> actualIntegers = task.filterIntegers(values);
        assertEquals(expectedIntegers, actualIntegers);
    }

    @Test
    public void testFilterIntegers_duplicateIntegers_filtersIntegers() {
        Task task = new Task();
        List<Object> values = Arrays.asList(3, 'c', 3, 3, 'a', 'b');
        List<Integer> expectedIntegers = Arrays.asList(3, 3, 3);
        List<Integer> actualIntegers = task.filterIntegers(values);
        assertEquals(expectedIntegers, actualIntegers);
    }
}
