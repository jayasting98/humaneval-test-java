package humanevaltest.unit.task80;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                !s.isHappy("a"),
                !s.isHappy("aa"),
                s.isHappy("abcd"),
                !s.isHappy("aabb"),
                s.isHappy("adb"),
                !s.isHappy("xyy"),
                s.isHappy("iopaxpoi"),
                !s.isHappy("iopaxioi")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
