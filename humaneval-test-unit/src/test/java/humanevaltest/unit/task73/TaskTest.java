package humanevaltest.unit.task73;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.smallestChange(new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 7, 9, 6))) == 4,
                s.smallestChange(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 2))) == 1,
                s.smallestChange(new ArrayList<>(Arrays.asList(1, 4, 2))) == 1,
                s.smallestChange(new ArrayList<>(Arrays.asList(1, 4, 4, 2))) == 1,
                s.smallestChange(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1))) == 0,
                s.smallestChange(new ArrayList<>(Arrays.asList(3, 1, 1, 3))) == 0,
                s.smallestChange(new ArrayList<>(List.of(1))) == 0,
                s.smallestChange(new ArrayList<>(Arrays.asList(0, 1))) == 1
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
