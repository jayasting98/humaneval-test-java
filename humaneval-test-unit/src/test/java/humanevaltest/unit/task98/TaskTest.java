package humanevaltest.unit.task98;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.countUpper("aBCdEf")  == 1,
                s.countUpper("abcdefg") == 0,
                s.countUpper("dBBE") == 0,
                s.countUpper("B")  == 0,
                s.countUpper("U")  == 1,
                s.countUpper("") == 0,
                s.countUpper("EEEE") == 2
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
