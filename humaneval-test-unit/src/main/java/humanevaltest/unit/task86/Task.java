package humanevaltest.unit.task86;

import java.util.*;

class Task {
    public String antiShuffle(String s) {
        String[] strings = s.split(" ");
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            result.add(String.copyValueOf(chars));
        }
        return String.join(" ", result);
    }
}
