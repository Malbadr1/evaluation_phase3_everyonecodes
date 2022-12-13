import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Athlete {

    private final String firstName;
    private final String lastName;
    private final double height;
    private final boolean suspended;

    public Athlete(String firstName, String lastName, double height, boolean suspended) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.suspended = suspended;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeight() {
        return height;
    }

    public boolean isSuspended() {
        return suspended;
    }
}

 class AthleteFinder {

    public List<Athlete> find(List<Athlete> athletes) {
        return athletes.stream()
                .filter(athlete -> !athlete.isSuspended())
                .filter(athlete -> athlete.getHeight() >= 1.75 && athlete.getHeight() <= 2.0)
                .sorted(Comparator.comparing(Athlete::getLastName))
                .limit(5)
                .collect(Collectors.toList());
    }
}
