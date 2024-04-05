package humanevaltest.unit.task14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testAllPrefixes_emptyString_returnsNoPrefixes() {
        Task task = new Task();
        String string = "";
        List<String> expectedPrefixes = List.of();
        List<String> actualPrefixes = task.allPrefixes(string);
        assertEquals(expectedPrefixes, actualPrefixes);
    }

    @Test
    public void testAllPrefixes_distinctCharacters_returnsPrefixes() {
        Task task = new Task();
        String string = "asdfgh";
        List<String> expectedPrefixes = Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh");
        List<String> actualPrefixes = task.allPrefixes(string);
        assertEquals(expectedPrefixes, actualPrefixes);
    }

    @Test
    public void testAllPrefixes_nonDistinctCharacters_returnsPrefixes() {
        Task task = new Task();
        String string = "WWW";
        List<String> expectedPrefixes = Arrays.asList("W", "WW", "WWW");
        List<String> actualPrefixes = task.allPrefixes(string);
        assertEquals(expectedPrefixes, actualPrefixes);
    }
}
