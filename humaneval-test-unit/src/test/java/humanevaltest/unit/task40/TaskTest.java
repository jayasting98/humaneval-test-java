package humanevaltest.unit.task40;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTriplesSumToZero_nonExistentTriple0_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(task.triplesSumToZero(l));
    }

    @Test
    public void testTriplesSumToZero_nonExistentTriple1_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(task.triplesSumToZero(l));
    }

    @Test
    public void testTriplesSumToZero_existingTriple0_returnsTrue() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 3, -2, 1);
        assertTrue(task.triplesSumToZero(l));
    }

    @Test
    public void testTriplesSumToZero_nonExistentTriple2_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(task.triplesSumToZero(l));
    }

    @Test
    public void testTriplesSumToZero_nonEnoughElementsForTriple_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1);
        assertFalse(task.triplesSumToZero(l));
    }

    @Test
    public void testTriplesSumToZero_existingTriple1_returnsTrue() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(2, 4, -5, 3, 9, 7);
        assertTrue(task.triplesSumToZero(l));
    }

    @Test
    public void testTriplesSumToZero_nonExistentTriple3_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(task.triplesSumToZero(l));
    }

    @Test
    public void testTriplesSumToZero_nonExistentTriple4_returnsFalse() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(task.triplesSumToZero(l));
    }
}
