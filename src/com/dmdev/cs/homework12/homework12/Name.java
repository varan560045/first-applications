package inputOutput.homework12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Collectors;

public final class Name {
    public String name = extractedName();

    public Name() throws IOException {
    }
    private static String extractedName() throws IOException {
        File name = Path.of("resources", "items-name.csv").toFile();
        try (BufferedReader nameReader = new BufferedReader(new FileReader(name))) {
            String collectName = nameReader.lines()
                    .collect(Collectors.joining(";"));
            return collectName;
        }
    }
}
