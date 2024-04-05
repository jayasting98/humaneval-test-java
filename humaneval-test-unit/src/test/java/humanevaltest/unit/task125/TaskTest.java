package humanevaltest.unit.task125;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.splitWords("Hello world!" ), Arrays.asList("Hello", "world!" )),
                Objects.equals(s.splitWords("Hello,world!" ), Arrays.asList("Hello", "world!" )),
                Objects.equals(s.splitWords("Hello world,!" ), Arrays.asList("Hello", "world,!" )),
                Objects.equals(s.splitWords("Hello,Hello,world !" ), Arrays.asList("Hello,Hello,world", "!" )),
                Objects.equals(s.splitWords("abcdef" ), 3),
                Objects.equals(s.splitWords("aaabb" ), 2),
                Objects.equals(s.splitWords("aaaBb" ), 1),
                Objects.equals(s.splitWords("" ), 0)
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
