package humanevaltest.coverage.task77;

import java.util.*;

class Solution {
    public boolean iscube(int a) {
        a = Math.abs(a);
        return Math.round(Math.pow(Math.round(Math.pow(a, 1. / 3)), 3)) == a;
    }
}
