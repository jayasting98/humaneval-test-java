package humanevaltest.unit.task150;

import java.util.*;
import java.lang.*;

class Solution {
    public int xOrY(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}
