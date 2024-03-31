package humanevaltest.coverage.task9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testRollingMax_noNumbers_returnsNoMaximaCorrectly() {
        Task task = new Task();
        List<Integer> numbers = List.of();
        List<Integer> expectedRollingMaxima = List.of();
        List<Integer> actualRollingMaxima = task.rollingMax(numbers);
        assertEquals(expectedRollingMaxima, actualRollingMaxima);
    }

    @Test
    public void testRollingMax_increasingNumbers_returnsSameNumbersCorrectly() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedRollingMaxima = Arrays.asList(1, 2, 3, 4);
        List<Integer> actualRollingMaxima = task.rollingMax(numbers);
        assertEquals(expectedRollingMaxima, actualRollingMaxima);
    }

    @Test
    public void testRollingMax_nonIncreasingNumbers_returnsOnlyFirstNumberCorrectly() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(4, 3, 2, 1);
        List<Integer> expectedRollingMaxima = Arrays.asList(4, 4, 4, 4);
        List<Integer> actualRollingMaxima = task.rollingMax(numbers);
        assertEquals(expectedRollingMaxima, actualRollingMaxima);
    }

    @Test
    public void testRollingMax_nonOrderedNumbers_returnsCorrectly() {
        Task task = new Task();
        List<Integer> numbers = Arrays.asList(3, 2, 3, 100, 3);
        List<Integer> expectedRollingMaxima = Arrays.asList(3, 3, 3, 100, 100);
        List<Integer> actualRollingMaxima = task.rollingMax(numbers);
        assertEquals(expectedRollingMaxima, actualRollingMaxima);
    }
}
