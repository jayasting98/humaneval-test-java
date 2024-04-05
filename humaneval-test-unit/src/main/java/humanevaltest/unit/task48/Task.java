package humanevaltest.unit.task48;

import java.util.*;

class Task {
    public boolean isPalindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
