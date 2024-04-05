package humanevaltest.unit.task55;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.fib(10) == 55,
                s.fib(1) == 1,
                s.fib(8) == 21,
                s.fib(11) == 89,
                s.fib(12) == 144
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
