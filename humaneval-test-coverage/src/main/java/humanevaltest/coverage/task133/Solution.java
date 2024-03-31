package humanevaltest.coverage.task133;

import java.util.*;

class Solution {
    public int sumSquares(List<Double> lst) {
        return lst.stream().map(p -> (int) Math.ceil(p)).map(p -> p * p).reduce(Integer::sum).get();
    }
}
