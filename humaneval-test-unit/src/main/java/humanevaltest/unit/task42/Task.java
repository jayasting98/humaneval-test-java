package humanevaltest.unit.task42;

import java.util.*;
import java.util.stream.Collectors;

class Task {
    public List<Integer> incrList(List<Integer> l) {
        return l.stream().map(p -> p + 1).collect(Collectors.toList());
    }
}
