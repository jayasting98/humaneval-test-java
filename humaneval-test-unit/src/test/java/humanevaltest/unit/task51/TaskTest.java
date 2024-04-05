package humanevaltest.unit.task51;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.removeVowels(""), ""),
                Objects.equals(s.removeVowels("abcdef\nghijklm"), "bcdf\nghjklm"),
                Objects.equals(s.removeVowels("fedcba"), "fdcb"),
                Objects.equals(s.removeVowels("eeeee"), ""),
                Objects.equals(s.removeVowels("acBAA"), "cB"),
                Objects.equals(s.removeVowels("EcBOO"), "cB"),
                Objects.equals(s.removeVowels("ybcd"), "ybcd")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
