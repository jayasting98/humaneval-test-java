package humanevaltest.unit.task15;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testStringSequence_0_only0() {
        Task task = new Task();
        int n = 0;
        String expectedSequence = "0";
        String actualSequence = task.stringSequence(n);
        assertEquals(expectedSequence, actualSequence);
    }

    @Test
    public void testStringSequence_3_0to3() {
        Task task = new Task();
        int n = 3;
        String expectedSequence = "0 1 2 3";
        String actualSequence = task.stringSequence(n);
        assertEquals(expectedSequence, actualSequence);
    }

    @Test
    public void testStringSequence_10_0to10() {
        Task task = new Task();
        int n = 10;
        String expectedSequence = "0 1 2 3 4 5 6 7 8 9 10";
        String actualSequence = task.stringSequence(n);
        assertEquals(expectedSequence, actualSequence);
    }
}
