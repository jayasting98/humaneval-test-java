package humanevaltest.original.task22;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.filterIntegers(new ArrayList<>(List.of())).equals(List.of()),
                s.filterIntegers(new ArrayList<>(Arrays.asList(4, Map.of(), List.of(), 23.2, 9, "adasd"))).equals(Arrays.asList(4, 9)),
                s.filterIntegers(new ArrayList<>(Arrays.asList(3, 'c', 3, 3, 'a', 'b'))).equals(Arrays.asList(3, 3, 3))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
