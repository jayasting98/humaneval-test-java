package humanevaltest.unit.task46;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFib4_typicalCase_calculatesCorrectly() {
        Task task = new Task();
        assertEquals(4, task.fib4(5));
        assertEquals(28, task.fib4(8));
        assertEquals(104, task.fib4(10));
        assertEquals(386, task.fib4(12));
    }
}
