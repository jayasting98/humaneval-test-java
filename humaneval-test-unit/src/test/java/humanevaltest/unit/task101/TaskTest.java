package humanevaltest.unit.task101;

import java.util.*;

public class TaskTest {
    public static void main(String[] args) {
        Task s = new Task();
        List<Boolean> correct = Arrays.asList(
                s.wordStrings("Hi, my name is John" ).equals(Arrays.asList("Hi", "my", "name", "is", "John" )),
                s.wordStrings("One, two, three, four, five, six" ).equals(Arrays.asList("One", "two", "three", "four", "five", "six" )),
                s.wordStrings("Hi, my name" ).equals(Arrays.asList("Hi", "my", "name" )),
                s.wordStrings("One,, two, three, four, five, six," ).equals(Arrays.asList("One", "two", "three", "four", "five", "six" )),
                s.wordStrings("" ).equals(List.of()),
                s.wordStrings("ahmed     , gamal" ).equals(Arrays.asList("ahmed", "gamal" ))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
