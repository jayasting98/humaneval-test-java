package humanevaltest.unit.task132;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.isNested("[[]]" ),
                !s.isNested("[]]]]]]][[[[[]" ),
                !s.isNested("[][]" ),
                !s.isNested("[]" ),
                s.isNested("[[[[]]]]" ),
                !s.isNested("[]]]]]]]]]]" ),
                s.isNested("[][][[]]" ),
                !s.isNested("[[]" ),
                !s.isNested("[]]" ),
                s.isNested("[[]][[" ),
                s.isNested("[[][]]" ),
                !s.isNested("" ),
                !s.isNested("[[[[[[[[" ),
                !s.isNested("]]]]]]]]" )
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
