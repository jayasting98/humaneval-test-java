package humanevaltest.coverage.task3;

import java.util.*;

class Solution {
    public boolean belowZero(List<Integer> operations) {
        int balance = 0;

        for (int op : operations) {
            balance += op;
            if (balance < 0) {
                return true;
            }
        }

        return false;
    }
}
