package humanevaltest.unit.task83;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.startsOneEnds(1) == 1,
                s.startsOneEnds(2) == 18,
                s.startsOneEnds(3) == 180,
                s.startsOneEnds(4) == 1800,
                s.startsOneEnds(5) == 18000
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
