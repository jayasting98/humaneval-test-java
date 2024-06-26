package humanevaltest.unit.task67;

import java.util.*;

class Task {
    public int fruitDistribution(String s, int n) {
        List<Integer> lis = new ArrayList<>();
        for (String i : s.split(" ")) {
            try {
                lis.add(Integer.parseInt(i));
            } catch (NumberFormatException ignored) {

            }
        }
        return n - lis.stream().mapToInt(Integer::intValue).sum();
    }
}
