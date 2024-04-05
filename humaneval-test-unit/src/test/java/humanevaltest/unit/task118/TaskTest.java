package humanevaltest.unit.task118;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.getClosestVowel("yogurt").equals("u"),
                s.getClosestVowel("full").equals("u"),
                s.getClosestVowel("easy").equals(""),
                s.getClosestVowel("eAsy").equals(""),
                s.getClosestVowel("ali").equals(""),
                s.getClosestVowel("bad").equals("a"),
                s.getClosestVowel("most").equals("o"),
                s.getClosestVowel("ab").equals(""),
                s.getClosestVowel("ba").equals(""),
                s.getClosestVowel("quick").equals(""),
                s.getClosestVowel("anime").equals("i"),
                s.getClosestVowel("Asia").equals(""),
                s.getClosestVowel("Above").equals("o")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
