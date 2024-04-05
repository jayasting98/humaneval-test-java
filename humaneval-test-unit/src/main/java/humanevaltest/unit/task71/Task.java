package humanevaltest.unit.task71;

import java.util.*;

class Task {
    public double triangleArea(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        area = (double) Math.round(area * 100) / 100;
        return area;
    }
}
