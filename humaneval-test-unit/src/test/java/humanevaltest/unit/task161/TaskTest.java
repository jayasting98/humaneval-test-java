package humanevaltest.unit.task161;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.solve("AsDf"), "aSdF"),
                Objects.equals(s.solve("1234"), "4321"),
                Objects.equals(s.solve("ab"), "AB"),
                Objects.equals(s.solve("#a@C"), "#A@c"),
                Objects.equals(s.solve("#AsdfW^45"), "#aSDFw^45"),
                Objects.equals(s.solve("#6@2"), "2@6#"),
                Objects.equals(s.solve("#$a^D"), "#$A^d"),
                Objects.equals(s.solve("#ccc"), "#CCC")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
