package humanevaltest.unit.task100;

import java.util.*;

class Task {
    public List<Integer> makeAPile(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(n + 2 * i);
        }
        return result;
    }
}
