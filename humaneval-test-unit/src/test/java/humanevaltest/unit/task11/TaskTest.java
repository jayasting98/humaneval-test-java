package humanevaltest.unit.task11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testStringXor_mixedOnesAndZeros_performsXorCorrectly() {
        Task task = new Task();
        String a = "111000";
        String b = "101010";
        String expectedXor = "010010";
        String actualXor = task.stringXor(a, b);
        assertEquals(expectedXor, actualXor);
    }

    @Test
    public void testStringXor_sameDigits_returnsZero() {
        Task task = new Task();
        String a = "1";
        String b = "1";
        String expectedXor = "0";
        String actualXor = task.stringXor(a, b);
        assertEquals(expectedXor, actualXor);
    }

    @Test
    public void testStringXor_bHasAllZeros_returnsA() {
        Task task = new Task();
        String a = "0101";
        String b = "0000";
        String expectedXor = "0101";
        String actualXor = task.stringXor(a, b);
        assertEquals(expectedXor, actualXor);
    }
}
