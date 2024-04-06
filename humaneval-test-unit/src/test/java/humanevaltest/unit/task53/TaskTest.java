package humanevaltest.unit.task53;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testAdd_typicalOperands_addsCorrectly() {
        Task task = new Task();
        assertEquals(1, task.add(0, 1));
        assertEquals(1, task.add(1, 0));
        assertEquals(5, task.add(2, 3));
        assertEquals(12, task.add(5, 7));
        assertEquals(12, task.add(7, 5));
    }

    @Test
    public void testAdd_randomOperands_addsCorrectly() {
        Task task = new Task();
        Random rand = new Random(42);
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt(1000), y = rand.nextInt(1000);
            assertEquals(x + y, task.add(x, y));
        }
    }
}
