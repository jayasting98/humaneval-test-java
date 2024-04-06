package humanevaltest.unit.task52;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testBelowThreshold_allNumbersLessThanThreshold0_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 2, 4, 10);
        int threshold = 100;
        assertTrue(task.belowThreshold(numbers, threshold));
    }

    @Test
    public void testBelowThreshold_someNumbersNotLessThanThreshold_returnsFalse() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 20, 4, 10);
        int threshold = 5;
        assertFalse(task.belowThreshold(numbers, threshold));
    }

    @Test
    public void testBelowThreshold_allNumbersLessThanThreshold1_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 20, 4, 10);
        int threshold = 21;
        assertTrue(task.belowThreshold(numbers, threshold));
    }

    @Test
    public void testBelowThreshold_allNumbersLessThanThreshold2_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 20, 4, 10);
        int threshold = 22;
        assertTrue(task.belowThreshold(numbers, threshold));
    }

    @Test
    public void testBelowThreshold_allNumbersLessThanThreshold3_returnsTrue() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 8, 4, 10);
        int threshold = 11;
        assertTrue(task.belowThreshold(numbers, threshold));
    }

    @Test
    public void testBelowThreshold_someNumbersEqualToThreshold_returnsFalse() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 8, 4, 10);
        int threshold = 10;
        assertFalse(task.belowThreshold(numbers, threshold));
    }
}
