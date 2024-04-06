package humanevaltest.unit.task42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testIncrList_emptyList_incrementsNothing() {
        Task task = new Task();
        List<Integer> l = Arrays.asList();
        List<Integer> expectedIncrementedNumbers = List.of();
        List<Integer> actualIncrementedNumbers = task.incrList(l);
        assertEquals(expectedIncrementedNumbers, actualIncrementedNumbers);
    }

    @Test
    public void testIncrList_typicalNumbers0_incrementsAll() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(3, 2, 1);
        List<Integer> expectedIncrementedNumbers = Arrays.asList(4, 3, 2);
        List<Integer> actualIncrementedNumbers = task.incrList(l);
        assertEquals(expectedIncrementedNumbers, actualIncrementedNumbers);
    }

    @Test
    public void testIncrList_typicalNumbers1_incrementsAll() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expectedIncrementedNumbers = Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124);
        List<Integer> actualIncrementedNumbers = task.incrList(l);
        assertEquals(expectedIncrementedNumbers, actualIncrementedNumbers);
    }
}
