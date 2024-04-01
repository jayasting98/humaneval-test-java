package humanevaltest.unit.task15;

import java.util.*;

class Solution {
    public String stringSequence(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
            sb.append(" ");
        }
        sb.append(n);
        return sb.toString();
    }
}
