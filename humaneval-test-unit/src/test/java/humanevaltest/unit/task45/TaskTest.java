package humanevaltest.unit.task45;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTriangleArea_typicalCase_calculatesCorrectly() {
        Task task = new Task();
        assertEquals(7.5, task.triangleArea(5, 3));
        assertEquals(2.0, task.triangleArea(2, 2));
        assertEquals(40.0, task.triangleArea(10, 8));
    }
}
