package humanevaltest.coverage.task30;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> getPositive(List<Integer> l) {
        return l.stream().filter(p -> p > 0).collect(Collectors.toList());
    }
}
