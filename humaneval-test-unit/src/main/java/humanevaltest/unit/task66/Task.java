package humanevaltest.unit.task66;

import java.util.*;

class Task {
    public int digitSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sum += c;
            }
        }
        return sum;
    }
}
