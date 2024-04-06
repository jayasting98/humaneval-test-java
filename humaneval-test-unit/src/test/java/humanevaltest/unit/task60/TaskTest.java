package humanevaltest.unit.task60;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testSumToN_nGreaterThanZero0_calculatesCorrectly() {
        Task task = new Task();
        int n = 1;
        int expectedSum = 1;
        int actualSum = task.sumToN(n);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumToN_nGreaterThanZero1_calculatesCorrectly() {
        Task task = new Task();
        int n = 6;
        int expectedSum = 21;
        int actualSum = task.sumToN(n);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumToN_nGreaterThanZero2_calculatesCorrectly() {
        Task task = new Task();
        int n = 11;
        int expectedSum = 66;
        int actualSum = task.sumToN(n);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumToN_nGreaterThanZero3_calculatesCorrectly() {
        Task task = new Task();
        int n = 30;
        int expectedSum = 465;
        int actualSum = task.sumToN(n);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumToN_nGreaterThanZero4_calculatesCorrectly() {
        Task task = new Task();
        int n = 100;
        int expectedSum = 5050;
        int actualSum = task.sumToN(n);
        assertEquals(expectedSum, actualSum);
    }
}
