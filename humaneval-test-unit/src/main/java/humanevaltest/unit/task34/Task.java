package humanevaltest.unit.task34;

import java.util.*;

class Task {
    public List<Integer> unique(List<Integer> l) {
        List<Integer> result = new ArrayList<>(new HashSet<>(l));
        Collections.sort(result);
        return result;
    }
}
