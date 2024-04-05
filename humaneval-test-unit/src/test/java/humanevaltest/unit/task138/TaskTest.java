package humanevaltest.unit.task138;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.isEqualToSumEven(4) == false,
                s.isEqualToSumEven(6) == false,
                s.isEqualToSumEven(8) == true,
                s.isEqualToSumEven(10) == true,
                s.isEqualToSumEven(11) == false,
                s.isEqualToSumEven(12) == true,
                s.isEqualToSumEven(13) == false,
                s.isEqualToSumEven(16) == true
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
