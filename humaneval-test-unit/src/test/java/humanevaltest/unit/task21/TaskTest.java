package humanevaltest.unit.task21;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.rescaleToUnit(new ArrayList<>(Arrays.asList(2.0, 49.9))).equals(Arrays.asList(0.0, 1.0)),
                s.rescaleToUnit(new ArrayList<>(Arrays.asList(100.0, 49.9))).equals(Arrays.asList(1.0, 0.0)),
                s.rescaleToUnit(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0))).equals(Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0)),
                s.rescaleToUnit(new ArrayList<>(Arrays.asList(2.0, 1.0, 5.0, 3.0, 4.0))).equals(Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75)),
                s.rescaleToUnit(new ArrayList<>(Arrays.asList(12.0, 11.0, 15.0, 13.0, 14.0))).equals(Arrays.asList(0.25, 0.0, 1.0, 0.5, 0.75))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
