package humanevaltest.unit.task36;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFizzBuzz_noMultiplesOf11Or13WithDigit7_counts0() {
        Task task = new Task();
        assertEquals(0, task.fizzBuzz(50));
    }

    @Test
    public void testFizzBuzz_someMultiplesOf11Or13WithDigit7_countsCorrectly() {
        Task task = new Task();
        assertEquals(2, task.fizzBuzz(78));
        assertEquals(3, task.fizzBuzz(79));
        assertEquals(3, task.fizzBuzz(100));
        assertEquals(6, task.fizzBuzz(200));
        assertEquals(192, task.fizzBuzz(4000));
        assertEquals(639, task.fizzBuzz(10000));
        assertEquals(8026, task.fizzBuzz(100000));
    }
}
