package humanevaltest.unit.task30;

import java.util.*;
import java.util.stream.Collectors;

class Task {
    public List<Integer> getPositive(List<Integer> l) {
        return l.stream().filter(p -> p > 0).collect(Collectors.toList());
    }
}
