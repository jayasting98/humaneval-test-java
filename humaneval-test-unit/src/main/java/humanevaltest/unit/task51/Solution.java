package humanevaltest.unit.task51;

import java.util.*;

class Solution {
    public String removeVowels(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
