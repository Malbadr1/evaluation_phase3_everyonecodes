import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberNamesDictionaryTest {

    NumberNamesDictionary dictionary = new NumberNamesDictionary();

    static Stream<Arguments> getNumberParameters() {
        return Stream.of(
                Arguments.of(Optional.empty(), ""),
                Arguments.of(Optional.empty(), "ten"),
                Arguments.of(Optional.of(1), "one"),
                Arguments.of(Optional.of(9), "nine")
        );
    }

    static Stream<Arguments> getNameParameters() {
        return Stream.of(
                Arguments.of(Optional.empty(), -1),
                Arguments.of(Optional.empty(), 10),
                Arguments.of(Optional.of("one"), 1),
                Arguments.of(Optional.of("nine"), 9)
        );
    }

    @ParameterizedTest
    @MethodSource("getNumberParameters")
    void getNumber(Optional<Integer> expected, String name) {
        Optional<Integer> result = dictionary.getNumber(name);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("getNameParameters")
    void getName(Optional<String> expected, Integer number) {
        Optional<String> result = dictionary.getName(number);

        assertEquals(expected, result);
    }
}

