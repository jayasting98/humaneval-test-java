package humanevaltest.unit.task7;

import java.util.*;

class Task {
    public List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();
        for (String x : strings) {
            if (x.contains(substring)) {
                result.add(x);
            }
        }
        return result;
    }
}
