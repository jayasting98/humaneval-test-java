package humanevaltest.unit.task14;

import java.util.*;

class Task {
    public List<String> allPrefixes(String string) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= string.length(); i++) {
            result.add(string.substring(0, i));
        }
        return result;
    }
}
