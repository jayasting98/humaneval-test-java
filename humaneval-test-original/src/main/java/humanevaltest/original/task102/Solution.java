package humanevaltest.original.task102;

import java.util.*;
import java.lang.*;

class Solution {
    public int chooseNum(int x, int y) {
        if (x > y) {
            return -1;
        }
        if (y % 2 == 0) {
            return y;
        }
        if (x == y) {
            return -1;
        }
        return y - 1;
    }
}
