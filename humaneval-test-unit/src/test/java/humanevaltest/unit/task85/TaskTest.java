package humanevaltest.unit.task85;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.add(new ArrayList<>(Arrays.asList(4, 88))) == 88,
                s.add(new ArrayList<>(Arrays.asList(4, 5, 6, 7, 2, 122))) == 122,
                s.add(new ArrayList<>(Arrays.asList(4, 0, 6, 7))) == 0,
                s.add(new ArrayList<>(Arrays.asList(4, 4, 6, 8))) == 12
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
