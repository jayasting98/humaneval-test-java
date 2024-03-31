package humanevaltest.coverage.task61;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
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
