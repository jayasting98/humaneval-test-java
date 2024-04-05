package humanevaltest.unit.task98;

import java.util.*;

class Task {
    public int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if ("AEIOU".indexOf(s.charAt(i)) != -1) {
                count += 1;
            }
        }
        return count;
    }
}
