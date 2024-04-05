package humanevaltest.unit.task92;

import java.util.*;

class Task {
    public boolean anyInt(Object x, Object y, Object z) {
        if (x instanceof Integer && y instanceof Integer && z instanceof Integer) {
            return (int) x + (int) y == (int) z || (int) x + (int) z == (int) y || (int) y + (int) z == (int) x;
        }
        return false;
    }
}
