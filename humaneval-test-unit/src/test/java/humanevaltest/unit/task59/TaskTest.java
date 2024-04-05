package humanevaltest.unit.task59;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.largestPrimeFactor(15) == 5,
                s.largestPrimeFactor(27) == 3,
                s.largestPrimeFactor(63) == 7,
                s.largestPrimeFactor(330) == 11,
                s.largestPrimeFactor(13195) == 29
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
