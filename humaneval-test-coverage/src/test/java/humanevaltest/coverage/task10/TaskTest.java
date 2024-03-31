package humanevaltest.coverage.task10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testMakePalindrome_emptyString_returnsEmptyString() {
        Task task = new Task();
        String string = "";
        String expectedPalindrome = "";
        String actualPalindrome = task.makePalindrome(string);
        assertEquals(expectedPalindrome, actualPalindrome);
    }

    @Test
    public void testMakePalindrome_oneCharacter_returnsCharacter() {
        Task task = new Task();
        String string = "x";
        String expectedPalindrome = "x";
        String actualPalindrome = task.makePalindrome(string);
        assertEquals(expectedPalindrome, actualPalindrome);
    }

    @Test
    public void testMakePalindrome_nonPalindrome0_returnsWithMirroredPrefix() {
        Task task = new Task();
        String string = "xyz";
        String expectedPalindrome = "xyzyx";
        String actualPalindrome = task.makePalindrome(string);
        assertEquals(expectedPalindrome, actualPalindrome);
    }

    @Test
    public void testMakePalindrome_palindrome_returnsSameString() {
        Task task = new Task();
        String string = "xyx";
        String expectedPalindrome = "xyx";
        String actualPalindrome = task.makePalindrome(string);
        assertEquals(expectedPalindrome, actualPalindrome);
    }

    @Test
    public void testMakePalindrome_nonPalindrome1_returnsWithMirroredPrefix() {
        Task task = new Task();
        String string = "jerry";
        String expectedPalindrome = "jerryrrej";
        String actualPalindrome = task.makePalindrome(string);
        assertEquals(expectedPalindrome, actualPalindrome);
    }
}
