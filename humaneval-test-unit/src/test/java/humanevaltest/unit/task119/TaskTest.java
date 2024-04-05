package humanevaltest.unit.task119;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.matchParens(Arrays.asList("()(", ")")).equals("Yes"),
                s.matchParens(Arrays.asList(")", ")")).equals("No"),
                s.matchParens(Arrays.asList("(()(())", "())())")).equals("No"),
                s.matchParens(Arrays.asList(")())", "(()()(")).equals("Yes"),
                s.matchParens(Arrays.asList("(())))", "(()())((")).equals("Yes"),
                s.matchParens(Arrays.asList("()", "())")).equals("No"),
                s.matchParens(Arrays.asList("(()(", "()))()")).equals("Yes"),
                s.matchParens(Arrays.asList("((((", "((())")).equals("No"),
                s.matchParens(Arrays.asList(")(()", "(()(")).equals("No"),
                s.matchParens(Arrays.asList(")(", ")(")).equals("No")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
