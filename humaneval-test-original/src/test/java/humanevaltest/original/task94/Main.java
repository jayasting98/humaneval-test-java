package humanevaltest.original.task94;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.skjkasdkd(Arrays.asList(0, 3, 2, 1, 3, 5, 7, 4, 5, 5, 5, 2, 181, 32, 4, 32, 3, 2, 32, 324, 4, 3)) == 10,
                s.skjkasdkd(Arrays.asList(1, 0, 1, 8, 2, 4597, 2, 1, 3, 40, 1, 2, 1, 2, 4, 2, 5, 1)) == 25,
                s.skjkasdkd(Arrays.asList(1, 3, 1, 32, 5107, 34, 83278, 109, 163, 23, 2323, 32, 30, 1, 9, 3)) == 13,
                s.skjkasdkd(Arrays.asList(0, 724, 32, 71, 99, 32, 6, 0, 5, 91, 83, 0, 5, 6)) == 11,
                s.skjkasdkd(Arrays.asList(0, 81, 12, 3, 1, 21)) == 3,
                s.skjkasdkd(Arrays.asList(0, 8, 1, 2, 1, 7)) == 7,
                s.skjkasdkd(List.of(8191)) == 19,
                s.skjkasdkd(Arrays.asList(8191, 123456, 127, 7)) == 19,
                s.skjkasdkd(Arrays.asList(127, 97, 8192)) == 10
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
