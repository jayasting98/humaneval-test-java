package humanevaltest.unit.task36;

import java.util.*;

class Task {
    public int fizzBuzz(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                char[] digits = String.valueOf(i).toCharArray();
                for (char c : digits) {
                    if (c == '7') {
                        result += 1;
                    }
                }
            }
        }
        return result;
    }
}
