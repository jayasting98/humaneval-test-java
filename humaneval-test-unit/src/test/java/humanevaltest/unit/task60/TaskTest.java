package humanevaltest.unit.task60;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.sumToN(1) == 1,
                s.sumToN(6) == 21,
                s.sumToN(11) == 66,
                s.sumToN(30) == 465,
                s.sumToN(100) == 5050
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
