package humanevaltest.unit.task61;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testCorrectBracketing_balanced0_returnsTrue() {
        Task task = new Task();
        String brackets = "()";
        assertTrue(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_balanced1_returnsTrue() {
        Task task = new Task();
        String brackets = "(()())";
        assertTrue(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_balanced2_returnsTrue() {
        Task task = new Task();
        String brackets = "()()(()())()";
        assertTrue(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_balanced3_returnsTrue() {
        Task task = new Task();
        String brackets = "()()((()()())())(()()(()))";
        assertTrue(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_extraClosingBracket0_returnsFalse() {
        Task task = new Task();
        String brackets = "((()())))";
        assertFalse(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_extraClosingBracket1_returnsFalse() {
        Task task = new Task();
        String brackets = ")(()";
        assertFalse(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_extraOpeningBrackets0_returnsFalse() {
        Task task = new Task();
        String brackets = "(";
        assertFalse(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_extraOpeningBrackets1_returnsFalse() {
        Task task = new Task();
        String brackets = "((((";
        assertFalse(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_extraClosingBracket2_returnsFalse() {
        Task task = new Task();
        String brackets = ")";
        assertFalse(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_extraOpeningBrackets2_returnsFalse() {
        Task task = new Task();
        String brackets = "(()";
        assertFalse(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_extraClosingBracket3_returnsFalse() {
        Task task = new Task();
        String brackets = "()()(()())())(()";
        assertFalse(task.correctBracketing(brackets));
    }

    @Test
    public void testCorrectBracketing_extraClosingBracket4_returnsFalse() {
        Task task = new Task();
        String brackets = "()()(()())()))()";
        assertFalse(task.correctBracketing(brackets));
    }
}
