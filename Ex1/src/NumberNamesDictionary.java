

        import java.util.Map;
        import java.util.Optional;

public class NumberNamesDictionary {

    private final Map<Integer, String> numbers = Map.of(
            0, "zero",
            1, "one",
            2, "two",
            3, "three",
            4, "four",
            5, "five",
            6, "six",
            7, "seven",
            8, "eight",
            9, "nine"
    );

    public Optional<Integer> getNumber(String name) {
        return numbers.entrySet().stream()
                .filter(number -> number.getValue().equals(name))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public Optional<String> getName(int number) {
        String name = numbers.get(number);
        return Optional.ofNullable(name);
    }
}

