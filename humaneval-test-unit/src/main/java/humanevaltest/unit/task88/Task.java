package humanevaltest.unit.task88;

import java.util.*;

class Task {
    public List<Integer> sortArray(List<Integer> array) {
        if (array.size() == 0) {
            return array;
        }
        List<Integer> result = new ArrayList<>(array);
        if ((result.get(0) + result.get(result.size() - 1)) % 2 == 1) {
            Collections.sort(result);
        } else {
            result.sort(Collections.reverseOrder());
        }
        return result;
    }
}
