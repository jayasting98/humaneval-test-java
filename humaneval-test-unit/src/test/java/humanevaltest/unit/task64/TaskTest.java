package humanevaltest.unit.task64;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.vowelsCount("abcde") == 2,
                s.vowelsCount("Alone") == 3,
                s.vowelsCount("key") == 2,
                s.vowelsCount("bye") == 1,
                s.vowelsCount("keY") == 2,
                s.vowelsCount("bYe") == 1,
                s.vowelsCount("ACEDY") == 3
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
