package humanevaltest.unit.task36;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.fizzBuzz(50) == 0,
                s.fizzBuzz(78) == 2,
                s.fizzBuzz(79) == 3,
                s.fizzBuzz(100) == 3,
                s.fizzBuzz(200) == 6,
                s.fizzBuzz(4000) == 192,
                s.fizzBuzz(10000) == 639,
                s.fizzBuzz(100000) == 8026
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
