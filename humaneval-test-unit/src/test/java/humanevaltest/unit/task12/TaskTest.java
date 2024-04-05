package humanevaltest.unit.task12;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testLongest_emptyList_returnsEmptyOptional() {
        Task task = new Task();
        List<String> strings = List.of();
        Optional<String> expectedLongest = Optional.empty();
        Optional<String> actualLongest = task.longest(strings);
        assertEquals(expectedLongest, actualLongest);
    }

    @Test
    public void testLongest_equalLengthStrings_returnsFirst() {
        Task task = new Task();
        List<String> strings = Arrays.asList("x", "y", "z");
        Optional<String> expectedLongest = Optional.of("x");
        Optional<String> actualLongest = task.longest(strings);
        assertEquals(expectedLongest, actualLongest);
    }

    @Test
    public void testLongest_unequalLengthStrings_returnsFirstLongest() {
        Task task = new Task();
        List<String> strings = Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc");
        Optional<String> expectedLongest = Optional.of("zzzz");
        Optional<String> actualLongest = task.longest(strings);
        assertEquals(expectedLongest, actualLongest);
    }
}
