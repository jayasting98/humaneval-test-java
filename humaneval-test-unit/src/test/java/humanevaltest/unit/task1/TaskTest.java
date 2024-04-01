package humanevaltest.unit.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testSeparateParenGroups_noSpacesWithinComplexGroups_returnsSeparatedGroups() {
        Task task = new Task();
        String parenString = "(()()) ((())) () ((())()())";
        List<String> expectedGroups = Arrays.asList("(()())", "((()))", "()", "((())()())");
        List<String> actualGroups = task.separateParenGroups(parenString);
        assertEquals(expectedGroups, actualGroups);
    }

    @Test
    public void testSeparateParenGroups_simpleGroups_returnsSeparatedGroups() {
        Task task = new Task();
        String parenString = "() (()) ((())) (((())))";
        List<String> expectedGroups = Arrays.asList("()", "(())", "((()))", "(((())))");
        List<String> actualGroups = task.separateParenGroups(parenString);
        assertEquals(expectedGroups, actualGroups);
    }

    @Test
    public void testSeparateParenGroups_oneGroup_returnsOneSeparatedGroup() {
        Task task = new Task();
        String parenString = "(()(())((())))";
        List<String> expectedGroups = Arrays.asList("(()(())((())))");
        List<String> actualGroups = task.separateParenGroups(parenString);
        assertEquals(expectedGroups, actualGroups);
    }

    @Test
    public void testSeparateParenGroups_spacesWithinGroups_returnsSeparatedGroups() {
        Task task = new Task();
        String parenString = "( ) (( )) (( )( ))";
        List<String> expectedGroups = Arrays.asList("()", "(())", "(()())");
        List<String> actualGroups = task.separateParenGroups(parenString);
        assertEquals(expectedGroups, actualGroups);
    }
}
