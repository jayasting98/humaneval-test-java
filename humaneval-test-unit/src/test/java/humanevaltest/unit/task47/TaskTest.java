package humanevaltest.unit.task47;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testMedian_oddNumberOfElementsWithMoreThanOneOnEachHalf_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(3, 1, 2, 4, 5);
        double expectedMedian = 3.0;
        double actualMedian = task.median(l);
        assertEquals(expectedMedian, actualMedian);
    }

    @Test
    public void testMedian_evenNumberOfElementsWithMoreThanOneOnEachHalf_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(-10, 4, 6, 1000, 10, 20);
        double expectedMedian = 8.0;
        double actualMedian = task.median(l);
        assertEquals(expectedMedian, actualMedian);
    }

    @Test
    public void testMedian_oddNumberOfElementsWithAtMostThanOneOnEachHalf_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(5);
        double expectedMedian = 5.0;
        double actualMedian = task.median(l);
        assertEquals(expectedMedian, actualMedian);
    }

    @Test
    public void testMedian_evenNumberOfElementsWithAtMostThanOneOnEachHalf_calculatesCorrectly() {
        Task task = new Task();
        List<Integer> l = Arrays.asList(6, 5);
        double expectedMedian = 5.5;
        double actualMedian = task.median(l);
        assertEquals(expectedMedian, actualMedian);
    }
}
