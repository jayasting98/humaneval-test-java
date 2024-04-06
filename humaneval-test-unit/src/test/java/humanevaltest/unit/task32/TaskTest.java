package humanevaltest.unit.task32;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFindZero_randomPolynomials_findsZero() {
        Task task = new Task();
        Random rand = new Random(42);
        for (int i = 0; i < 100; i++) {
            int ncoeff = 2 * (rand.nextInt(3) + 1);
            List<Double> coeffs = new ArrayList<>();
            for (int j = 0; j < ncoeff; j++) {
                int coeff = rand.nextInt(20) - 10;
                if (coeff == 0) {
                    coeff = 1;
                }
                coeffs.add((double) coeff);
            }
            double solution = task.findZero(coeffs);
            double delta = 1e-4;
            double expectedValueAtRoot = 0.0;
            double actualValueAtRoot = Math.abs(task.poly(coeffs, solution));
            assertEquals(expectedValueAtRoot, actualValueAtRoot, delta);
        }
    }
}
