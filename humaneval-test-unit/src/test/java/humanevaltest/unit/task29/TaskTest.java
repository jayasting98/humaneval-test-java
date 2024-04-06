package humanevaltest.unit.task29;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFilterByPrefix_emptyList_returnsEmptyList() {
        Task task = new Task();
        List<String> strings = List.of();
        String prefix = "john";
        List<String> expectedFilteredStrings = List.of();
        List<String> actualFilteredStrings = task.filterByPrefix(strings, prefix);
        assertEquals(expectedFilteredStrings, actualFilteredStrings);
    }

    @Test
    public void testFilterByPrefix_typicalString_returnsOnlyStringsWithPrefix() {
        Task task = new Task();
        List<String> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        String prefix = "xxx";
        List<String> expectedFilteredStrings = Arrays.asList("xxx", "xxxAAA", "xxx");
        List<String> actualFilteredStrings = task.filterByPrefix(strings, prefix);
        assertEquals(expectedFilteredStrings, actualFilteredStrings);
    }
}
