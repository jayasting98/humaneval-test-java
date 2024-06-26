package humanevaltest.unit.task79;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.decimalToBinary(0), "db0db"),
                Objects.equals(s.decimalToBinary(32), "db100000db"),
                Objects.equals(s.decimalToBinary(103), "db1100111db"),
                Objects.equals(s.decimalToBinary(15), "db1111db")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
