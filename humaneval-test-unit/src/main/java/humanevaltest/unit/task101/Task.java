package humanevaltest.unit.task101;

import java.util.*;

class Task {
    public List<String> wordStrings(String s) {
        if (s.length() == 0) {
            return List.of();
        }
        StringBuilder sb = new StringBuilder();

        for (char letter : s.toCharArray()) {
            if (letter == ',') {
                sb.append(' ');
            } else {
                sb.append(letter);
            }
        }

        return new ArrayList<>(Arrays.asList(sb.toString().split("\s+" )));
    }
}
