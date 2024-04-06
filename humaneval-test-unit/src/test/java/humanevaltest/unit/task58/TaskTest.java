package humanevaltest.unit.task58;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testCommon_someCommonElements0_returnsSortedCommonElements() {
        Task task = new Task();
        List<Integer> numbers1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Integer> numbers2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Integer> expectedCommonNumbers = Arrays.asList(1, 5, 653);
        List<Integer> actualCommonNumbers = task.common(numbers1, numbers2);
        assertEquals(expectedCommonNumbers, actualCommonNumbers);
    }

    @Test
    public void testCommon_someCommonElements1_returnsSortedCommonElements() {
        Task task = new Task();
        List<Integer> numbers1 = Arrays.asList(5, 3, 2, 8);
        List<Integer> numbers2 = Arrays.asList(3, 2);
        List<Integer> expectedCommonNumbers = Arrays.asList(2, 3);
        List<Integer> actualCommonNumbers = task.common(numbers1, numbers2);
        assertEquals(expectedCommonNumbers, actualCommonNumbers);
    }

    @Test
    public void testCommon_someCommonElements2_returnsSortedCommonElements() {
        Task task = new Task();
        List<Integer> numbers1 = Arrays.asList(4, 3, 2, 8);
        List<Integer> numbers2 = Arrays.asList(3, 2, 4);
        List<Integer> expectedCommonNumbers = Arrays.asList(2, 3, 4);
        List<Integer> actualCommonNumbers = task.common(numbers1, numbers2);
        assertEquals(expectedCommonNumbers, actualCommonNumbers);
    }

    @Test
    public void testCommon_oneEmptyList_returnsNoCommonElements() {
        Task task = new Task();
        List<Integer> numbers1 = Arrays.asList(4, 3, 2, 8);
        List<Integer> numbers2 = List.of();
        List<Integer> expectedCommonNumbers = List.of();
        List<Integer> actualCommonNumbers = task.common(numbers1, numbers2);
        assertEquals(expectedCommonNumbers, actualCommonNumbers);
    }
}
