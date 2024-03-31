package humanevaltest.unit.task52;

import java.util.*;

class Solution {
    public boolean belowThreshold(List<Integer> l, int t) {
        for (int e : l) {
            if (e >= t) {
                return false;
            }
        }
        return true;
    }
}
