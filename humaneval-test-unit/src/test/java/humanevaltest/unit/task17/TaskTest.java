package humanevaltest.unit.task17;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.parseMusic("").equals(List.of()),
                s.parseMusic("o o o o").equals(Arrays.asList(4, 4, 4, 4)),
                s.parseMusic(".| .| .| .|").equals(Arrays.asList(1, 1, 1, 1)),
                s.parseMusic("o| o| .| .| o o o o").equals(Arrays.asList(2, 2, 1, 1, 4, 4, 4, 4)),
                s.parseMusic("o| .| o| .| o o| o o|").equals(Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
