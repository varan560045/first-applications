package inputOutput.homework12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Collectors;

public final class Price {

    public String price = extractedStringPrice();
    public Price() throws IOException {
    }
    private static String extractedStringPrice() throws IOException {
        File price = Path.of("resources", "items-price.csv").toFile();
        try (BufferedReader priceReader = new BufferedReader(new FileReader(price))) {
            String collectPrice = priceReader.lines()
                    .collect(Collectors.joining(";"));
            return collectPrice;
        }
    }

}
