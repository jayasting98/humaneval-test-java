package humanevaltest.unit.task0;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testHasCloseElements_withinThreshold0_returnsTrue() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(11.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        double threshold = 0.3;
        assertTrue(task.hasCloseElements(numbers, threshold));
    }

    @Test
    public void testHasCloseElements_beyondThreshold0_returnsFalse() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        double threshold = 0.05;
        assertFalse(task.hasCloseElements(numbers, threshold));
    }

    @Test
    public void testHasCloseElements_withinThreshold1_returnsTrue() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        double threshold = 0.95;
        assertTrue(task.hasCloseElements(numbers, threshold));
    }

    @Test
    public void testHasCloseElements_beyondThreshold1_returnsFalse() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        double threshold = 0.8;
        assertFalse(task.hasCloseElements(numbers, threshold));
    }

    @Test
    public void testHasCloseElements_withinThreshold2_returnsTrue() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        double threshold = 0.1;
        assertTrue(task.hasCloseElements(numbers, threshold));
    }

    @Test
    public void testHasCloseElements_withinThreshold3_returnsTrue() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        double threshold = 1.0;
        assertTrue(task.hasCloseElements(numbers, threshold));
    }

    @Test
    public void testHasCloseElements_beyondThreshold2_returnsFalse() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        double threshold = 0.5;
        assertFalse(task.hasCloseElements(numbers, threshold));
    }
}
