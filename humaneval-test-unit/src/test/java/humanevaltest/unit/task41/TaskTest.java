package humanevaltest.unit.task41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testCarRaceCollision_typicalCase_calculatesCorrectNumberOfCollisions() {
        Task task = new Task();
        assertEquals(4, task.carRaceCollision(2));
        assertEquals(9, task.carRaceCollision(3));
        assertEquals(16, task.carRaceCollision(4));
        assertEquals(64, task.carRaceCollision(8));
        assertEquals(100, task.carRaceCollision(10));
    }
}
