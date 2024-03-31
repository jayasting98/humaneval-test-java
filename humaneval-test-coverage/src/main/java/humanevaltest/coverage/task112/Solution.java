package humanevaltest.coverage.task112;

import java.util.*;

class Solution {
    public List<Object> reverseDelete(String s, String c) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (c.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        return Arrays.asList(sb.toString(), sb.toString().equals(sb.reverse().toString()));
    }
}
