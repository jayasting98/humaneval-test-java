package humanevaltest.unit.task18;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testHowManyTimes_emptyString_counts0() {
        Task task = new Task();
        String string = "";
        String substring = "x";
        int expectedCount = 0;
        int actualCount = task.howManyTimes(string, substring);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testHowManyTimes_singleCharacter_countsCorrectly() {
        Task task = new Task();
        String string = "xyxyxyx";
        String substring = "x";
        int expectedCount = 4;
        int actualCount = task.howManyTimes(string, substring);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testHowManyTimes_overlappingSubstrings_countsCorrectly() {
        Task task = new Task();
        String string = "cacacacac";
        String substring = "cac";
        int expectedCount = 4;
        int actualCount = task.howManyTimes(string, substring);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testHowManyTimes_spacedWords_countsCorrectly() {
        Task task = new Task();
        String string = "john doe";
        String substring = "john";
        int expectedCount = 1;
        int actualCount = task.howManyTimes(string, substring);
        assertEquals(expectedCount, actualCount);
    }
}
