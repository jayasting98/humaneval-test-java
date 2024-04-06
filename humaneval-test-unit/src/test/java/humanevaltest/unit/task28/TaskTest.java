package humanevaltest.unit.task28;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testConcatenate_emptyList_concatenatesNothing() {
        Task task = new Task();
        List<String> strings = List.of();
        String expectedConcatenation = "";
        String actualConcatenation = task.concatenate(strings);
        assertEquals(expectedConcatenation, actualConcatenation);
    }

    @Test
    public void testConcatenate_typicalStrings0_concatenatesStrings() {
        Task task = new Task();
        List<String> strings = Arrays.asList("x", "y", "z");
        String expectedConcatenation = "xyz";
        String actualConcatenation = task.concatenate(strings);
        assertEquals(expectedConcatenation, actualConcatenation);
    }

    @Test
    public void testConcatenate_typicalStrings1_concatenatesStrings() {
        Task task = new Task();
        List<String> strings = Arrays.asList("x", "y", "z", "w", "k");
        String expectedConcatenation = "xyzwk";
        String actualConcatenation = task.concatenate(strings);
        assertEquals(expectedConcatenation, actualConcatenation);
    }
}
