package humanevaltest.unit.task85;

import java.util.*;

class Task {
    public int add(List<Integer> lst) {
        int sum = 0;
        for (int i = 1; i < lst.size(); i += 2) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}
