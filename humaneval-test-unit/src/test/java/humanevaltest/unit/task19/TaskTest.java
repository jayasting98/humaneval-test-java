package humanevaltest.unit.task19;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testSortNumbers_noNumbers_returnsNoNumbers() {
        Task task = new Task();
        String numbers = "";
        String expectedSortedNumbers = "";
        String actualSortedNumbers = task.sortNumbers(numbers);
        assertEquals(expectedSortedNumbers, actualSortedNumbers);
    }

    @Test
    public void testSortNumbers_oneNumbers_returnsNumber() {
        Task task = new Task();
        String numbers = "three";
        String expectedSortedNumbers = "three";
        String actualSortedNumbers = task.sortNumbers(numbers);
        assertEquals(expectedSortedNumbers, actualSortedNumbers);
    }

    @Test
    public void testSortNumbers_sortedNumbers_returnsNumbersUnchanged() {
        Task task = new Task();
        String numbers = "three five nine";
        String expectedSortedNumbers = "three five nine";
        String actualSortedNumbers = task.sortNumbers(numbers);
        assertEquals(expectedSortedNumbers, actualSortedNumbers);
    }

    @Test
    public void testSortNumbers_unsortedNumbers_returnsSortedNumbers() {
        Task task = new Task();
        String numbers = "five zero four seven nine eight";
        String expectedSortedNumbers = "zero four five seven eight nine";
        String actualSortedNumbers = task.sortNumbers(numbers);
        assertEquals(expectedSortedNumbers, actualSortedNumbers);
    }
}
