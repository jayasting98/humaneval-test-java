package humanevaltest.coverage.task114;

import java.util.*;

class Solution {
    public int minSubArraySum(List<Integer> nums) {
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
            if (minSum > sum) {
                minSum = sum;
            }
            if (sum > 0) {
                sum = 0;
            }
        }
        return minSum;
    }
}
