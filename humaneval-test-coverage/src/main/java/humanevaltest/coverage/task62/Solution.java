package humanevaltest.coverage.task62;

import java.util.*;

class Solution {
    public List<Integer> derivative(List<Integer> xs) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < xs.size(); i++) {
            result.add(i * xs.get(i));
        }
        return result;
    }
}
