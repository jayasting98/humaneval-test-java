package humanevaltest.unit.task43;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                !s.pairsSumToZero(new ArrayList<>(Arrays.asList(1, 3, 5, 0))),
                !s.pairsSumToZero(new ArrayList<>(Arrays.asList(1, 3, -2, 1))),
                !s.pairsSumToZero(new ArrayList<>(Arrays.asList(1, 2, 3, 7))),
                s.pairsSumToZero(new ArrayList<>(Arrays.asList(2, 4, -5, 3, 5, 7))),
                !s.pairsSumToZero(new ArrayList<>(List.of(1))),
                s.pairsSumToZero(new ArrayList<>(Arrays.asList(-3, 9, -1, 3, 2, 30))),
                s.pairsSumToZero(new ArrayList<>(Arrays.asList(-3, 9, -1, 3, 2, 31))),
                !s.pairsSumToZero(new ArrayList<>(Arrays.asList(-3, 9, -1, 4, 2, 30))),
                !s.pairsSumToZero(new ArrayList<>(Arrays.asList(-3, 9, -1, 4, 2, 31)))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
