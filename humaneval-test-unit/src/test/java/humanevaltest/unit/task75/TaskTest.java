package humanevaltest.unit.task75;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                !s.isMultiplyPrime(5),
                s.isMultiplyPrime(30),
                s.isMultiplyPrime(8),
                !s.isMultiplyPrime(10),
                s.isMultiplyPrime(125),
                s.isMultiplyPrime(3 * 5 * 7),
                !s.isMultiplyPrime(3 * 6 * 7),
                !s.isMultiplyPrime(9 * 9 * 9),
                !s.isMultiplyPrime(11 * 9 * 9),
                s.isMultiplyPrime(11 * 13 * 7)
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
