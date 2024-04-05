package humanevaltest.unit.task104;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.uniqueDigits(Arrays.asList(15, 33, 1422, 1)).equals(Arrays.asList(1, 15, 33)),
                s.uniqueDigits(Arrays.asList(152, 323, 1422, 10)).equals(List.of()),
                s.uniqueDigits(Arrays.asList(12345, 2033, 111, 151)).equals(Arrays.asList(111, 151)),
                s.uniqueDigits(Arrays.asList(135, 103, 31)).equals(Arrays.asList(31, 135))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
