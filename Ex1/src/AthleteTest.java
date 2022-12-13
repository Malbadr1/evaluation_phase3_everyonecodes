import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AthleteFinderTest {
    private AthleteFinder finder = new AthleteFinder();

    @Test
    void find() {
        var result = finder.find(List.of(
                new Athlete("John", "Smith", 1.86, false),
                new Athlete("Jack", "Miller", 1.75, false),
                new Athlete("Joe", "Sable", 1.56, false),
                new Athlete("Sarah", "Daringer", 1.46, false),
                new Athlete("Lisa", "Fleetwood", 1.92, false),
                new Athlete("Danny", "Fitzpatrick", 1.86, false),
                new Athlete("Eliza", "Smithson", 2.02, false),
                new Athlete("Peter", "Jackson", 2.00, true),
                new Athlete("Francis", "Slater", 2.13, false),
                new Athlete("Louis", "Aldrin", 1.79, false),
                new Athlete("Sandra", "Bauer", 1.99, false)
        ));
        var expected = List.of(
                new Athlete("Louis", "Aldrin", 1.79, false),
                new Athlete("Sandra", "Bauer", 1.99, false),
                new Athlete("Danny", "Fitzpatrick", 1.86, false),
                new Athlete("Lisa", "Fleetwood", 1.92, false),
                new Athlete("John", "Smith", 1.86, false)
        );
        assertEquals(expected, result);
    }
}