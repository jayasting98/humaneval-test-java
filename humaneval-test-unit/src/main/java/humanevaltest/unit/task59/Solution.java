package humanevaltest.unit.task59;

import java.util.*;
import java.lang.*;

class Solution {
    public int largestPrimeFactor(int n) {
        int largest = 1;
        for (int j = 2; j <= n; j++) {
            if (n % j == 0) {
                boolean is_prime = j >= 2;
                for (int i = 2; i < j - 1; i++) {
                    if (j % i == 0) {
                        is_prime = false;
                        break;
                    }
                }
                if (is_prime) {
                    largest = Math.max(largest, j);
                }
            }
        }
        return largest;
    }
}
