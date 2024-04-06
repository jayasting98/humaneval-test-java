package humanevaltest.unit.task43;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testPairsSumToZero_nonExistentPair0_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(task.pairsSumToZero(l));
    }

    @Test
    public void testPairsSumToZero_nonExistentPair1_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 3, -2, 1);
        assertFalse(task.pairsSumToZero(l));
    }

    @Test
    public void testPairsSumToZero_nonExistentPair2_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 2, 3, 7);
        assertFalse(task.pairsSumToZero(l));
    }

    @Test
    public void testPairsSumToZero_existingPair0_returnsTrue() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(2, 4, -5, 3, 5, 7);
        assertTrue(task.pairsSumToZero(l));
    }

    @Test
    public void testPairsSumToZero_notEnoughElementsForPair_returnsFalse() {
        Task task = new Task();
        List<Integer> l = List.of(1);
        assertFalse(task.pairsSumToZero(l));
    }

    @Test
    public void testPairsSumToZero_existingPair1_returnsTrue() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(-3, 9, -1, 3, 2, 30);
        assertTrue(task.pairsSumToZero(l));
    }

    @Test
    public void testPairsSumToZero_existingPair2_returnsTrue() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(-3, 9, -1, 3, 2, 31);
        assertTrue(task.pairsSumToZero(l));
    }

    @Test
    public void testPairsSumToZero_nonExistentPair3_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(-3, 9, -1, 4, 2, 30);
        assertFalse(task.pairsSumToZero(l));
    }

    @Test
    public void testPairsSumToZero_nonExistentPair4_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(-3, 9, -1, 4, 2, 31);
        assertFalse(task.pairsSumToZero(l));
    }
}
