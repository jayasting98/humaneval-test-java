package humanevaltest.unit.task89;

import java.util.*;

class Task {
    public String encrypt(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append((char) ('a' + (c - 'a' + 2 * 2) % 26));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
