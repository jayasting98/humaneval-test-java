package humanevaltest.unit.task131;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.digits(5) == 5,
                s.digits(54) == 5,
                s.digits(120) == 1,
                s.digits(5014) == 5,
                s.digits(98765) == 315,
                s.digits(5576543) == 2625
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
