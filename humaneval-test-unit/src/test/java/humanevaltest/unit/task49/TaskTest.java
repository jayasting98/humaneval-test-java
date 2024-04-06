package humanevaltest.unit.task49;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testModp_nonZeroN_calculatesCorrectly() {
        Task task = new Task();
        assertEquals(3, task.modp(3, 5));
        assertEquals(2, task.modp(1101, 101));
        assertEquals(8, task.modp(3, 11));
        assertEquals(1, task.modp(100, 101));
        assertEquals(4, task.modp(30, 5));
        assertEquals(3, task.modp(31, 5));
    }

    @Test
    public void testModp_zeroN_calculates1() {
        Task task = new Task();
        assertEquals(1, task.modp(0, 101));
    }
}
