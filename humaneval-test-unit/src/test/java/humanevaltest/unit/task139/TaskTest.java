package humanevaltest.unit.task139;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.specialFactorial(4) == 288,
                s.specialFactorial(5) == 34560,
                s.specialFactorial(7) == 125411328000L,
                s.specialFactorial(1) == 1
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
