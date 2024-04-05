package humanevaltest.unit.task23;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testStrlen_emptyString_measures0() {
        Task task = new Task();
        String string = "";
        int expectedLength = 0;
        int actualLength = task.strlen(string);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void testStrlen_oneCharacter_measures1() {
        Task task = new Task();
        String string = "x";
        int expectedLength = 1;
        int actualLength = task.strlen(string);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void testStrlen_typicalString_measuresCorrectly() {
        Task task = new Task();
        String string = "asdasnakj";
        int expectedLength = 9;
        int actualLength = task.strlen(string);
        assertEquals(expectedLength, actualLength);
    }
}
