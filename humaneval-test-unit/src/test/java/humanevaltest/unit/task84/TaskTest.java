package humanevaltest.unit.task84;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.solve(1000), "1"),
                Objects.equals(s.solve(150), "110"),
                Objects.equals(s.solve(147), "1100"),
                Objects.equals(s.solve(333), "1001"),
                Objects.equals(s.solve(963), "10010")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
