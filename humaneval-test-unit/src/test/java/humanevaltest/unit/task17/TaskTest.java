package humanevaltest.unit.task17;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testParseMusic_emptyString_parsesNothing() {
        Task task = new Task();
        String string = "";
        List<Integer> expectedBeats = List.of();
        List<Integer> actualBeats = task.parseMusic(string);
        assertEquals(expectedBeats, actualBeats);
    }

    @Test
    public void testParseMusic_allWhole_parsesOnly4s() {
        Task task = new Task();
        String string = "o o o o";
        List<Integer> expectedBeats = Arrays.asList(4, 4, 4, 4);
        List<Integer> actualBeats = task.parseMusic(string);
        assertEquals(expectedBeats, actualBeats);
    }

    @Test
    public void testParseMusic_allQuarters_parsesOnly1s() {
        Task task = new Task();
        String string = ".| .| .| .|";
        List<Integer> expectedBeats = Arrays.asList(1, 1, 1, 1);
        List<Integer> actualBeats = task.parseMusic(string);
        assertEquals(expectedBeats, actualBeats);
    }

    @Test
    public void testParseMusic_mixed0_parsesCorrectly() {
        Task task = new Task();
        String string = "o| o| .| .| o o o o";
        List<Integer> expectedBeats = Arrays.asList(2, 2, 1, 1, 4, 4, 4, 4);
        List<Integer> actualBeats = task.parseMusic(string);
        assertEquals(expectedBeats, actualBeats);
    }

    @Test
    public void testParseMusic_mixed1_parsesCorrectly() {
        Task task = new Task();
        String string = "o| .| o| .| o o| o o|";
        List<Integer> expectedBeats = Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2);
        List<Integer> actualBeats = task.parseMusic(string);
        assertEquals(expectedBeats, actualBeats);
    }
}
