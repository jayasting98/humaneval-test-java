package humanevaltest.coverage.task63;

import java.util.*;

class Solution {
    public int fibfib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibfib(n - 1) + fibfib(n - 2) + fibfib(n - 3);
    }
}
