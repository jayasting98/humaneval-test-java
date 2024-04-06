package humanevaltest.unit.task54;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testSameChars_sameCharacters0_returnsTrue() {
        Task task = new Task();
        String string1 = "eabcdzzzz";
        String string2 = "dddzzzzzzzddeddabc";
        assertTrue(task.sameChars(string1, string2));
    }

    @Test
    public void testSameChars_sameCharacters1_returnsTrue() {
        Task task = new Task();
        String string1 = "abcd";
        String string2 = "dddddddabc";
        assertTrue(task.sameChars(string1, string2));
    }

    @Test
    public void testSameChars_sameCharacters2_returnsTrue() {
        Task task = new Task();
        String string1 = "dddddddabc";
        String string2 = "abcd";
        assertTrue(task.sameChars(string1, string2));
    }

    @Test
    public void testSameChars_differentCharacters0_returnsFalse() {
        Task task = new Task();
        String string1 = "eabcd";
        String string2 = "dddddddabc";
        assertFalse(task.sameChars(string1, string2));
    }

    @Test
    public void testSameChars_differentCharacters1_returnsFalse() {
        Task task = new Task();
        String string1 = "abcd";
        String string2 = "dddddddabcf";
        assertFalse(task.sameChars(string1, string2));
    }

    @Test
    public void testSameChars_differentCharacters2_returnsFalse() {
        Task task = new Task();
        String string1 = "eabcdzzzz";
        String string2 = "dddzzzzzzzddddabc";
        assertFalse(task.sameChars(string1, string2));
    }

    @Test
    public void testSameChars_differentCharacters3_returnsFalse() {
        Task task = new Task();
        String string1 = "aabb";
        String string2 = "aaccc";
        assertFalse(task.sameChars(string1, string2));
    }
}
