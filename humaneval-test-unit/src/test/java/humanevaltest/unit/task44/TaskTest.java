package humanevaltest.unit.task44;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testChangeBase_notLessThanBase_changesBase() {
        Task task = new Task();
        assertEquals("22", task.changeBase(8, 3));
        assertEquals("100", task.changeBase(9, 3));
        assertEquals("11101010", task.changeBase(234, 2));
        assertEquals("10000", task.changeBase(16, 2));
        assertEquals("1000", task.changeBase(8, 2));
        assertEquals("111", task.changeBase(7, 2));
    }

    @Test
    public void testChangeBase_lessThanBase_sameNumber() {
        Task task = new Task();
        for (int x = 2; x < 8; x++) {
            assertEquals(String.valueOf(x), task.changeBase(x, x + 1));
        }
    }
}
