package humanevaltest.coverage.task60;

import java.util.*;

class Solution {
    public int sumToN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
