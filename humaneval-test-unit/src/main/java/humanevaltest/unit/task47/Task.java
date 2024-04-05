package humanevaltest.unit.task47;

import java.util.*;

class Task {
    public double median(List<Integer> l) {
        List<Integer> list = l;
        Collections.sort(list);
        if (l.size() % 2 == 1) {
            return l.get(l.size() / 2);
        } else {
            return (l.get(l.size() / 2 - 1) + l.get(l.size() / 2)) / 2.0;
        }
    }
}
