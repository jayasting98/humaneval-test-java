package humanevaltest.unit.task34;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.unique(new ArrayList<>(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))).equals(Arrays.asList(0, 2, 3, 5, 9, 123))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
