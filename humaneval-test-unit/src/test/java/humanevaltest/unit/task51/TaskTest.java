package humanevaltest.unit.task51;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testRemoveVowels_emptyString_removesNothing() {
        Task task = new Task();
        String text = "";
        String expectedResult = "";
        String actualResult = task.removeVowels(text);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveVowels_textWithVowelsAndNonAlphabet_removesVowels() {
        Task task = new Task();
        String text = "abcdef\nghijklm";
        String expectedResult = "bcdf\nghjklm";
        String actualResult = task.removeVowels(text);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveVowels_textWithVowelsInLowerCase_removesVowels() {
        Task task = new Task();
        String text = "fedcba";
        String expectedResult = "fdcb";
        String actualResult = task.removeVowels(text);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveVowels_textWithOnlyVowels_removesEverything() {
        Task task = new Task();
        String text = "eeeee";
        String expectedResult = "";
        String actualResult = task.removeVowels(text);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveVowels_textWithVowelsInBothCases_removesVowels() {
        Task task = new Task();
        String text = "acBAA";
        String expectedResult = "cB";
        String actualResult = task.removeVowels(text);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveVowels_textWithVowelsInUpperCase_removesVowels() {
        Task task = new Task();
        String text = "EcBOO";
        String expectedResult = "cB";
        String actualResult = task.removeVowels(text);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveVowels_textWithNoVowels_removesVowels() {
        Task task = new Task();
        String text = "ybcd";
        String expectedResult = "ybcd";
        String actualResult = task.removeVowels(text);
        assertEquals(expectedResult, actualResult);
    }
}
