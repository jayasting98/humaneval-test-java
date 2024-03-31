package humanevaltest.coverage.task49;

import java.util.*;

class Solution {
    public int modp(int n, int p) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret = (ret * 2) % p;
        }
        return ret;
    }
}
