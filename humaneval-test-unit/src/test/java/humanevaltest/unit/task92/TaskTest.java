package humanevaltest.unit.task92;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.anyInt(2, 3, 1) == true,
                s.anyInt(2.5, 2, 3) == false,
                s.anyInt(1.5, 5, 3.5) == false,
                s.anyInt(2, 6, 2) == false,
                s.anyInt(4, 2, 2) == true,
                s.anyInt(2.2, 2.2, 2.2) == false,
                s.anyInt(-4, 6, 2) == true,
                s.anyInt(2, 1, 1) == true,
                s.anyInt(3, 4, 7) == true,
                s.anyInt(3.0, 4, 7) == false
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
