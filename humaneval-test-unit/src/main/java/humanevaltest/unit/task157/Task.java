package humanevaltest.unit.task157;

import java.util.*;

class Task {
    public boolean rightAngleTriangle(int a, int b, int c) {
        return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
    }
}
