package humanevaltest.unit.task77;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.iscube(1),
                !s.iscube(2),
                s.iscube(-1),
                s.iscube(64),
                !s.iscube(180),
                s.iscube(1000),
                s.iscube(0),
                !s.iscube(1729)
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
