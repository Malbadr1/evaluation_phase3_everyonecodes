import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class AvocadoEntryReader {

    private String contentRootPath =
            "src/io/everyonecodes/java/t11_evaluation2/files/avocado.csv";

    public List<AvocadoEntry> read() {
        Path path = Path.of(contentRootPath);
        try {
            return Files.lines(path)
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(List::of)
                    .map(toAvocadoEntry())
                    .collect(toList());
        } catch (IOException e) {
//            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private Function<List<String>, AvocadoEntry> toAvocadoEntry() {
        return columns -> new AvocadoEntry(
                columns.get(11),
                Double.parseDouble(columns.get(2)),
                Double.parseDouble(columns.get(3)),
                columns.get(13),
                Integer.parseInt(columns.get(12))
        );
    }
}
