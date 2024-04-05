package humanevaltest.unit.task41;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.carRaceCollision(2) == 4,
                s.carRaceCollision(3) == 9,
                s.carRaceCollision(4) == 16,
                s.carRaceCollision(8) == 64,
                s.carRaceCollision(10) == 100
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
