package humanevaltest.unit.task120;

import java.util.*;

class Solution {
    public List<Integer> maximum(List<Integer> arr, int k) {
        if (k == 0) {
            return List.of();
        }
        List<Integer> arr_sort = new ArrayList<>(arr);
        Collections.sort(arr_sort);
        return arr_sort.subList(arr_sort.size() - k, arr_sort.size());
    }
}
