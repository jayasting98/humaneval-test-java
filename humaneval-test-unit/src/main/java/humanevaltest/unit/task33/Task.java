package humanevaltest.unit.task33;

import java.util.*;

class Task {
    public List<Integer> sortThird(List<Integer> l) {
        List<Integer> thirds = new ArrayList<>();
        for (int i = 0; i < l.size(); i += 3) {
            thirds.add(l.get(i));
        }
        Collections.sort(thirds);
        List<Integer> result = l;
        for (int i = 0; i < l.size(); i += 3) {
            result.set(i, thirds.get(i / 3));
        }
        return result;
    }
}
