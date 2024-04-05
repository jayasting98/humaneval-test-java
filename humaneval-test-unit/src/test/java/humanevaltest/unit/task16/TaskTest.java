package humanevaltest.unit.task16;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testCountDistinctCharacters_emptyString_counts0() {
        Task task = new Task();
        String string = "";
        int expectedCount = 0;
        int actualCount = task.countDistinctCharacters(string);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountDistinctCharacters_allDistinctCharacters_countsLength() {
        Task task = new Task();
        String string = "abcde";
        int expectedCount = 5;
        int actualCount = task.countDistinctCharacters(string);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountDistinctCharacters_repeatedCharacters_countsOnlyDistinctCharacters() {
        Task task = new Task();
        String string = "abcde" + "cade" + "CADE";
        int expectedCount = 5;
        int actualCount = task.countDistinctCharacters(string);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountDistinctCharacters_repeatedCharacterWithDifferentCase_counts1() {
        Task task = new Task();
        String string = "aaaaAAAAaaaa";
        int expectedCount = 1;
        int actualCount = task.countDistinctCharacters(string);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountDistinctCharacters_repeatedCharactersWithSpace_countsOnlyDistinctCharacters() {
        Task task = new Task();
        String string = "Jerry jERRY JeRRRY";
        int expectedCount = 5;
        int actualCount = task.countDistinctCharacters(string);
        assertEquals(expectedCount, actualCount);
    }
}
