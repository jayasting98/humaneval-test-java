package humanevaltest.original.task6;

import java.util.*;
import java.lang.*;

class Solution {
    public List<Integer> parseNestedParens(String paren_string) {
        String[] groups = paren_string.split(" ");
        List<Integer> result = new ArrayList<>(List.of());
        for (String group : groups) {
            if (group.length() > 0) {
                int depth = 0;
                int max_depth = 0;
                for (char c : group.toCharArray()) {
                    if (c == '(') {
                        depth += 1;
                        max_depth = Math.max(depth, max_depth);
                    } else {
                        depth -= 1;
                    }
                }
                result.add(max_depth);
            }
        }
        return result;
    }
}
