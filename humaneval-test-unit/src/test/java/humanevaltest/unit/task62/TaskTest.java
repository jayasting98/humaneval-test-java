package humanevaltest.unit.task62;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testDerivative_typicalCoefficients_calculatesDifferentiatedCoefficients() {
        Task task = new Task();
        List<Integer> coefficients = Arrays.asList(3, 1, 2, 4, 5);
        List<Integer> expectedDifferentiatedCoefficients = Arrays.asList(1, 4, 12, 20);
        List<Integer> actualDifferentiatedCoefficients = task.derivative(coefficients);
        assertEquals(expectedDifferentiatedCoefficients, actualDifferentiatedCoefficients);
    }

    @Test
    public void testDerivative_increasingCoefficients_calculatesDifferentiatedCoefficients() {
        Task task = new Task();
        List<Integer> coefficients = Arrays.asList(1, 2, 3);
        List<Integer> expectedDifferentiatedCoefficients = Arrays.asList(2, 6);
        List<Integer> actualDifferentiatedCoefficients = task.derivative(coefficients);
        assertEquals(expectedDifferentiatedCoefficients, actualDifferentiatedCoefficients);
    }

    @Test
    public void testDerivative_decreasingCoefficients_calculatesDifferentiatedCoefficients() {
        Task task = new Task();
        List<Integer> coefficients = Arrays.asList(3, 2, 1);
        List<Integer> expectedDifferentiatedCoefficients = Arrays.asList(2, 2);
        List<Integer> actualDifferentiatedCoefficients = task.derivative(coefficients);
        assertEquals(expectedDifferentiatedCoefficients, actualDifferentiatedCoefficients);
    }

    @Test
    public void testDerivative_withZeroCoefficient_calculatesDifferentiatedCoefficients() {
        Task task = new Task();
        List<Integer> coefficients = Arrays.asList(3, 2, 1, 0, 4);
        List<Integer> expectedDifferentiatedCoefficients = Arrays.asList(2, 2, 0, 16);
        List<Integer> actualDifferentiatedCoefficients = task.derivative(coefficients);
        assertEquals(expectedDifferentiatedCoefficients, actualDifferentiatedCoefficients);
    }

    @Test
    public void testDerivative_onlyConstant_returnsNoDifferentiatedCoefficients() {
        Task task = new Task();
        List<Integer> coefficients = List.of(1);
        List<Integer> expectedDifferentiatedCoefficients = List.of();
        List<Integer> actualDifferentiatedCoefficients = task.derivative(coefficients);
        assertEquals(expectedDifferentiatedCoefficients, actualDifferentiatedCoefficients);
    }
}
