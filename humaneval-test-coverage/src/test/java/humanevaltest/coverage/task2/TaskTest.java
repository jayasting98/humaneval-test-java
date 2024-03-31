package humanevaltest.coverage.task2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTruncateNumber_nonRepeatingBinaryDecimal_returnsExactly() {
        Task task = new Task();
        double expectedTruncatedNumber = 0.5;
        double actualTruncatedNumber = task.truncateNumber(3.5);
        assertEquals(expectedTruncatedNumber, actualTruncatedNumber);
    }

    @Test
    public void testTruncateNumber_repeatingBinaryDecimal0_returnsApproximately() {
        Task task = new Task();
        double expectedTruncatedNumber = 0.33;
        double actualTruncatedNumber = task.truncateNumber(1.33);
        double delta = 1e-6;
        assertEquals(expectedTruncatedNumber, actualTruncatedNumber, delta);
    }

    @Test
    public void testTruncateNumber_repeatingBinaryDecimal1_returnsApproximately() {
        Task task = new Task();
        double expectedTruncatedNumber = 0.456;
        double actualTruncatedNumber = task.truncateNumber(123.456);
        double delta = 1e-6;
        assertEquals(expectedTruncatedNumber, actualTruncatedNumber, delta);
    }
}
