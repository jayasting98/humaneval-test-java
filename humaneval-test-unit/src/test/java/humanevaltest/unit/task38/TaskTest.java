package humanevaltest.unit.task38;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    static char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static Random rand = new Random(42);

    public static String randomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(letters[rand.nextInt(26)]);
        }
        return sb.toString();
    }

    @Test
    public void testEncodeCyclic_randomStrings_encodesCorrectly() {
        Task task = new Task();
        for (int i = 0; i < 100; i++) {
            String str = randomString(rand.nextInt(10) + 10);
            String encodedStr = task.encodeCyclic(str);
            assertEquals(str, task.decodeCyclic(encodedStr));
        }
    }
}
