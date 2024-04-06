package humanevaltest.unit.task48;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testIsPalindrome_emptyString_returnsTrue() {
        Task task = new Task();
        String text = "";
        assertTrue(task.isPalindrome(text));
    }

    @Test
    public void testIsPalindrome_palindrome_returnsTrue() {
        Task task = new Task();
        String text = "aba";
        assertTrue(task.isPalindrome(text));
    }

    @Test
    public void testIsPalindrome_allSameCharacter_returnsTrue() {
        Task task = new Task();
        String text = "aaaaa";
        assertTrue(task.isPalindrome(text));
    }

    @Test
    public void testIsPalindrome_nonPalindrome_returnsFalse() {
        Task task = new Task();
        String text = "zbcd";
        assertFalse(task.isPalindrome(text));
    }

    @Test
    public void testIsPalindrome_palindromeWithMoreCharacters_returnsTrue() {
        Task task = new Task();
        String text = "xywyx";
        assertTrue(task.isPalindrome(text));
    }

    @Test
    public void testIsPalindrome_almostPlaindrome0_returnsFalse() {
        Task task = new Task();
        String text = "xywyz";
        assertFalse(task.isPalindrome(text));
    }

    @Test
    public void testIsPalindrome_almostPlaindrome1_returnsFalse() {
        Task task = new Task();
        String text = "xywzx";
        assertFalse(task.isPalindrome(text));
    }
}
