package humanevaltest.unit.task63;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFibfib_nEqualsTwo_calculates1() {
        Task task = new Task();
        int n = 2;
        int expectedValue = 1;
        int actualValue = task.fibfib(n);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFibfib_nEqualsOne_calculates0() {
        Task task = new Task();
        int n = 1;
        int expectedValue = 0;
        int actualValue = task.fibfib(n);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFibfib_nGreaterThanTwo0_calculatesCorrectly() {
        Task task = new Task();
        int n = 5;
        int expectedValue = 4;
        int actualValue = task.fibfib(n);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFibfib_nGreaterThanTwo1_calculatesCorrectly() {
        Task task = new Task();
        int n = 8;
        int expectedValue = 24;
        int actualValue = task.fibfib(n);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFibfib_nGreaterThanTwo2_calculatesCorrectly() {
        Task task = new Task();
        int n = 10;
        int expectedValue = 81;
        int actualValue = task.fibfib(n);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFibfib_nGreaterThanTwo3_calculatesCorrectly() {
        Task task = new Task();
        int n = 12;
        int expectedValue = 274;
        int actualValue = task.fibfib(n);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFibfib_nGreaterThanTwo4_calculatesCorrectly() {
        Task task = new Task();
        int n = 14;
        int expectedValue = 927;
        int actualValue = task.fibfib(n);
        assertEquals(expectedValue, actualValue);
    }
}
