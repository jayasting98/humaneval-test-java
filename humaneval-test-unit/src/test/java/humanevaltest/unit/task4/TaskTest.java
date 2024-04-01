package humanevaltest.unit.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testMeanAbsoluteDeviation_typicalCase0_calculatesCorrectly() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        double expectedMeanAbsoluteDeviation = 2.0 / 3.0;
        double actualMeanAbsoluteDeviation = task.meanAbsoluteDeviation(numbers);
        double delta = 1e-6;
        assertEquals(expectedMeanAbsoluteDeviation, actualMeanAbsoluteDeviation, delta);
    }

    @Test
    public void testMeanAbsoluteDeviation_typicalCase1_calculatesCorrectly() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        double expectedMeanAbsoluteDeviation = 1.0;
        double actualMeanAbsoluteDeviation = task.meanAbsoluteDeviation(numbers);
        double delta = 1e-6;
        assertEquals(expectedMeanAbsoluteDeviation, actualMeanAbsoluteDeviation, delta);
    }

    @Test
    public void testMeanAbsoluteDeviation_typicalCase2_calculatesCorrectly() {
        Task task = new Task();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        double expectedMeanAbsoluteDeviation = 6.0 / 5.0;
        double actualMeanAbsoluteDeviation = task.meanAbsoluteDeviation(numbers);
        double delta = 1e-6;
        assertEquals(expectedMeanAbsoluteDeviation, actualMeanAbsoluteDeviation, delta);
    }
}
