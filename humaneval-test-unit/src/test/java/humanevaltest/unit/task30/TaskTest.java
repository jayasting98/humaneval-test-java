package humanevaltest.unit.task30;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testGetPositive_typicalNumbers0_getsPositiveNumbersOnly() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(-1, -2, 4, 5, 6);
        List<Integer> expectedPositiveNumbers = Arrays.asList(4, 5, 6);
        List<Integer> actualPositiveNumbers = task.getPositive(l);
        assertEquals(expectedPositiveNumbers, actualPositiveNumbers);
    }

    @Test
    public void testGetPositive_typicalNumbers1_getsPositiveNumbersOnly() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
        List<Integer> expectedPositiveNumbers = Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1);
        List<Integer> actualPositiveNumbers = task.getPositive(l);
        assertEquals(expectedPositiveNumbers, actualPositiveNumbers);
    }

    @Test
    public void testGetPositive_onlyNegativeNumbers_getsNothing() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(-1, -2);
        List<Integer> expectedPositiveNumbers = List.of();
        List<Integer> actualPositiveNumbers = task.getPositive(l);
        assertEquals(expectedPositiveNumbers, actualPositiveNumbers);
    }

    @Test
    public void testGetPositive_emptyList_getsNothing() {
        Task task = new Task();
        List<Integer> l = List.of();
        List<Integer> expectedPositiveNumbers = List.of();
        List<Integer> actualPositiveNumbers = task.getPositive(l);
        assertEquals(expectedPositiveNumbers, actualPositiveNumbers);
    }
}
