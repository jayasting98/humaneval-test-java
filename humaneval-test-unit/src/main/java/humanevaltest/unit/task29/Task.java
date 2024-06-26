package humanevaltest.unit.task29;

import java.util.*;
import java.util.stream.Collectors;

class Task {
    public List<String> filterByPrefix(List<String> strings, String prefix) {
        return strings.stream().filter(p -> p.startsWith(prefix)).collect(Collectors.toList());
    }
}
