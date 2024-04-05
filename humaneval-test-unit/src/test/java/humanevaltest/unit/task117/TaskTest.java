package humanevaltest.unit.task117;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.selectWords("Mary had a little lamb", 4).equals(List.of("little" )),
                s.selectWords("Mary had a little lamb", 3).equals(Arrays.asList("Mary", "lamb")),
                s.selectWords("simple white space", 2).equals(List.of()),
                s.selectWords("Hello world", 4).equals(List.of("world" )),
                s.selectWords("Uncle sam", 3).equals(List.of("Uncle" )),
                s.selectWords("", 4).equals(List.of()),
                s.selectWords("a b c d e f", 1).equals(Arrays.asList("b", "c", "d", "f"))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
