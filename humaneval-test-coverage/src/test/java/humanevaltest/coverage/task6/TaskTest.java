package humanevaltest.coverage.task6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testParseNestedParens_complexGroups_parsesCorrectly() {
        Task task = new Task();
        String parenString = "(()()) ((())) () ((())()())";
        List<Integer> expectedMaxDepths = Arrays.asList(2, 3, 1, 3);
        List<Integer> actualMaxDepths = task.parseNestedParens(parenString);
        assertEquals(expectedMaxDepths, actualMaxDepths);
    }

    @Test
    public void testParseNestedParens_simpleGroups_parsesCorrectly() {
        Task task = new Task();
        String parenString = "() (()) ((())) (((())))";
        List<Integer> expectedMaxDepths = Arrays.asList(1, 2, 3, 4);
        List<Integer> actualMaxDepths = task.parseNestedParens(parenString);
        assertEquals(expectedMaxDepths, actualMaxDepths);
    }

    @Test
    public void testParseNestedParens_oneGroup_parsesCorrectly() {
        Task task = new Task();
        String parenString = "(()(())((())))";
        List<Integer> expectedMaxDepths = Arrays.asList(4);
        List<Integer> actualMaxDepths = task.parseNestedParens(parenString);
        assertEquals(expectedMaxDepths, actualMaxDepths);
    }
}
