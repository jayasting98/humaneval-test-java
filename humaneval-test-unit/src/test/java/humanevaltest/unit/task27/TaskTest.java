package humanevaltest.unit.task27;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFlipCase_emptyString_flipsNothing() {
        Task task = new Task();
        String string = "";
        String expectedFlippedCaseString = "";
        String actualFlippedCaseString = task.flipCase(string);
        assertEquals(expectedFlippedCaseString, actualFlippedCaseString);
    }

    @Test
    public void testFlipCase_withNonAlphabet_flipsAlphabets() {
        Task task = new Task();
        String string = "Hello!";
        String expectedFlippedCaseString = "hELLO!";
        String actualFlippedCaseString = task.flipCase(string);
        assertEquals(expectedFlippedCaseString, actualFlippedCaseString);
    }

    @Test
    public void testFlipCase_multipleWords_flipsAlphabetsInWords() {
        Task task = new Task();
        String string = "These violent delights have violent ends";
        String expectedFlippedCaseString = "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS";
        String actualFlippedCaseString = task.flipCase(string);
        assertEquals(expectedFlippedCaseString, actualFlippedCaseString);
    }
}
