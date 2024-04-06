package humanevaltest.unit.task57;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testMonotonic_increasingNumbers0_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 2, 4, 10);
        assertTrue(task.monotonic(numbers));
    }

    @Test
    public void testMonotonic_increasingNumbers1_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 2, 4, 20);
        assertTrue(task.monotonic(numbers));
    }

    @Test
    public void testMonotonic_nonMonotonicNumbers0_returnsFalse() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 20, 4, 10);
        assertFalse(task.monotonic(numbers));
    }

    @Test
    public void testMonotonic_decreasingNumbers_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(4, 1, 0, -10);
        assertTrue(task.monotonic(numbers));
    }

    @Test
    public void testMonotonic_nonIncreasingNumbers_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(4, 1, 1, 0);
        assertTrue(task.monotonic(numbers));
    }

    @Test
    public void testMonotonic_nonMonotonicNumbers1_returnsFalse() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 5, 60);
        assertFalse(task.monotonic(numbers));
    }

    @Test
    public void testMonotonic_increasingNumbers2_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 60);
        assertTrue(task.monotonic(numbers));
    }

    @Test
    public void testMonotonic_sameNumber_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(9, 9, 9, 9);
        assertTrue(task.monotonic(numbers));
    }
}
