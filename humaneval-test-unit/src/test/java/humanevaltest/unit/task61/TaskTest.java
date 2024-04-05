package humanevaltest.unit.task61;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.correctBracketing("()"),
                s.correctBracketing("(()())"),
                s.correctBracketing("()()(()())()"),
                s.correctBracketing("()()((()()())())(()()(()))"),
                !s.correctBracketing("((()())))"),
                !s.correctBracketing(")(()"),
                !s.correctBracketing("("),
                !s.correctBracketing("(((("),
                !s.correctBracketing(")"),
                !s.correctBracketing("(()"),
                !s.correctBracketing("()()(()())())(()"),
                !s.correctBracketing("()()(()())()))()")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
