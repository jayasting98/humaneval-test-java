package humanevaltest.unit.task65;

import java.util.*;

class Task {
    public String circularShift(int x, int shift) {
        String s = String.valueOf(x);
        if (shift > s.length()) {
            return new StringBuilder(s).reverse().toString();
        } else {
            return s.substring(s.length() - shift) + s.substring(0, s.length() - shift);
        }
    }
}
