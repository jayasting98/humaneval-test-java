package humanevaltest.unit.task12;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.longest(new ArrayList<>(List.of())).isEmpty(),
                Objects.equals(s.longest(new ArrayList<>(Arrays.asList("x", "y", "z"))).get(), "x"),
                Objects.equals(s.longest(new ArrayList<>(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc"))).get(), "zzzz")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
