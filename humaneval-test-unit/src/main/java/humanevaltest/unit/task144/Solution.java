package humanevaltest.unit.task144;

import java.util.*;

class Solution {
    public boolean simplify(String x, String n) {
        String[] a = x.split("/");
        String[] b = n.split("/");
        int numerator = Integer.parseInt(a[0]) * Integer.parseInt(b[0]);
        int denom = Integer.parseInt(a[1]) * Integer.parseInt(b[1]);
        return numerator / denom * denom == numerator;
    }
}
