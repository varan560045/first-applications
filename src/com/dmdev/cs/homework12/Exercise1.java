package inputOutput.homework12;

import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1 - считать 1ый файл
 * 2 - считать 2ой файл
 * 3 - объединить их по ID полю в result.csv с полями ID, NAME, PRICE
 */
public class Exercise1 {


    public static void main(String[] args) throws IOException {

        String line = extractedStringPrice();
        String[] keyValuePairs = line.split(";");
        Map<String, String> mapName = new HashMap<>();

        for (String pair : keyValuePairs) {
            String[] kv = pair.split(",");
            if (kv.length == 2) {
                String key = kv[0];
                String value = kv[1];
                mapName.put(key, value);
            }
        }

        String line2 = extractedName();
        String[] keyValuePairs2 = line2.split(";");
        Map<String, String[]> mapPrice = new HashMap<>();

        for (String pair : keyValuePairs2) {
            String[] kv = pair.split(",");
            if (kv.length == 3) {
                String key = kv[0];
                String[] value = {kv[1], kv[2]};
                mapPrice.put(key, value);
            }
        }

        Map<String, String[]> resultMap = new HashMap<>();

        for (Map.Entry<String, String> entry : mapName.entrySet()) {
            String key = entry.getKey();
            String value1 = entry.getValue();

            if (mapPrice.containsKey(key)) {
                String[] values2 = mapPrice.get(key);
                resultMap.put(key, new String[]{value1, values2[0]});
            }
        }

        File path = Path.of("resources", "result.csv").toFile();
        try (FileWriter fileWriter = new FileWriter(path)) {
            for (Map.Entry<String, String[]> entry : resultMap.entrySet()) {
                String key = entry.getKey();
                String[] values = entry.getValue();
                fileWriter.write(key + " = ");
                for (int i = 0; i < values.length; i++) {
                    fileWriter.write(values[i]);
                    if (i != values.length - 1) {
                        fileWriter.write(", ");
                    }
                }
                fileWriter.write(System.lineSeparator());
            }
        }
    }

    private static String extractedStringPrice() throws IOException {
        File price = Path.of("resources", "items-price.csv").toFile();
        try (BufferedReader priceReader = new BufferedReader(new FileReader(price))) {
            String collectPrice = priceReader.lines()
                    .collect(Collectors.joining(";"));
            return collectPrice;
        }
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

