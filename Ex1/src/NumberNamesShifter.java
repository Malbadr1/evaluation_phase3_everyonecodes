import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberNamesShifter {

    private final NumberNamesDictionary dictionary = new NumberNamesDictionary();

    public List<String> shift(List<String> names) {
        // Get the numbers corresponding to the given names
        List<Integer> numbers = names.stream()
                .map(dictionary::getNumber)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());


        numbers = numbers.stream()
                .map(number -> number + 1)
                .collect(Collectors.toList());


        List<String> shiftedNames = numbers.stream()
                .map(dictionary::getName)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        return shiftedNames;
    }}
