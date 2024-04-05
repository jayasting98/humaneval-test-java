package humanevaltest.unit.task20;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFindClosestElements_adjacentClosestElements_findsCorrectly() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        List<Double> expectedClosestElements = Arrays.asList(3.9, 4.0);
        List<Double> actualClosestElements = task.findClosestElements(numbers);
        assertEquals(expectedClosestElements, actualClosestElements);
    }

    @Test
    public void testFindClosestElements_unsortedClosestElements_findsSortedClosestElements() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        List<Double> expectedClosestElements = Arrays.asList(5.0, 5.9);
        List<Double> actualClosestElements = task.findClosestElements(numbers);
        assertEquals(expectedClosestElements, actualClosestElements);
    }

    @Test
    public void testFindClosestElements_nonAdjacentClosestElements_findsCorrectly() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2);
        List<Double> expectedClosestElements = Arrays.asList(2.0, 2.2);
        List<Double> actualClosestElements = task.findClosestElements(numbers);
        assertEquals(expectedClosestElements, actualClosestElements);
    }

    @Test
    public void testFindClosestElements_equalsClosestElements_findsCorrectly() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        List<Double> expectedClosestElements = Arrays.asList(2.0, 2.0);
        List<Double> actualClosestElements = task.findClosestElements(numbers);
        assertEquals(expectedClosestElements, actualClosestElements);
    }

    @Test
    public void testFindClosestElements_sortedList_findsCorrectly() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        List<Double> expectedClosestElements = Arrays.asList(2.2, 3.1);
        List<Double> actualClosestElements = task.findClosestElements(numbers);
        assertEquals(expectedClosestElements, actualClosestElements);
    }
}
