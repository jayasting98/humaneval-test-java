package humanevaltest.coverage.task7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFilterBySubstring_emptyList_filtersNothingCorrectly() {
        Task task = new Task();
        List<String> strings = List.of();
        String substring = "john";
        List<String> expectedFilteredStrings = List.of();
        List<String> actualFilteredStrings = task.filterBySubstring(strings, substring);
        assertEquals(expectedFilteredStrings, actualFilteredStrings);
    }

    @Test
    public void testFilterBySubstring_nonOverlappingSubstrings_filtersCorrectly() {
        Task task = new Task();
        List<String> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        String substring = "xxx";
        List<String> expectedFilteredStrings = Arrays.asList("xxx", "xxxAAA", "xxx");
        List<String> actualFilteredStrings = task.filterBySubstring(strings, substring);
        assertEquals(expectedFilteredStrings, actualFilteredStrings);
    }

    @Test
    public void testFilterBySubstring_overlappingSubstrings_filtersCorrectly() {
        Task task = new Task();
        List<String> strings = Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx");
        String substring = "xx";
        List<String> expectedFilteredStrings = Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx");
        List<String> actualFilteredStrings = task.filterBySubstring(strings, substring);
        assertEquals(expectedFilteredStrings, actualFilteredStrings);
    }

    @Test
    public void testFilterBySubstring_withinWord_filtersCorrectly() {
        Task task = new Task();
        List<String> strings = Arrays.asList("grunt", "trumpet", "prune", "gruesome");
        String substring = "run";
        List<String> expectedFilteredStrings = Arrays.asList("grunt", "prune");
        List<String> actualFilteredStrings = task.filterBySubstring(strings, substring);
        assertEquals(expectedFilteredStrings, actualFilteredStrings);
    }
}
