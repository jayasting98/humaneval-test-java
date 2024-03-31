package humanevaltest.coverage.task3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testBelowZero_noOperations_returnsFalse() {
        Task task = new Task();
        List<Integer> operations = Arrays.asList();
        assertFalse(task.belowZero(operations));
    }

    @Test
    public void testBelowZero_atLeastZero0_returnsFalse() {
        Task task = new Task();
        List<Integer> operations = Arrays.asList(1, 2, -3, 1, 2, -3);
        assertFalse(task.belowZero(operations));
    }

    @Test
    public void testBelowZero_belowZero0_returnsTrue() {
        Task task = new Task();
        List<Integer> operations = Arrays.asList(1, 2, -4, 5, 6);
        assertTrue(task.belowZero(operations));
    }

    @Test
    public void testBelowZero_atLeastZero1_returnsFalse() {
        Task task = new Task();
        List<Integer> operations = Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4);
        assertFalse(task.belowZero(operations));
    }

    @Test
    public void testBelowZero_belowZero1_returnsTrue() {
        Task task = new Task();
        List<Integer> operations = Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5);
        assertTrue(task.belowZero(operations));
    }

    @Test
    public void testBelowZero_belowZero2_returnsTrue() {
        Task task = new Task();
        List<Integer> operations = Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4);
        assertTrue(task.belowZero(operations));
    }
}
