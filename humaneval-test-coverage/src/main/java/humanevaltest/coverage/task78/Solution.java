package humanevaltest.coverage.task78;

import java.util.*;

class Solution {
    public int hexKey(String num) {
        String primes = "2357BD";
        int total = 0;
        for (char c : num.toCharArray()) {
            if (primes.indexOf(c) != -1) {
                total += 1;
            }
        }
        return total;
    }
}
