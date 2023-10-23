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

        Name name = new Name();
        Price price = new Price();
        String line = price.price;
        String line2 = name.name;
        String[] keyValuePairs = line.split(";");
        Map<String, String> mapPrice = new HashMap<>();

        for (String pair : keyValuePairs) {
            String[] kv = pair.split(",");
            if (kv.length == 2) {
                String key = kv[0];
                String value = kv[1];
                mapPrice.put(key, value);
            }
        }
        
        String[] keyValuePairs2 = line2.split(";");
        Map<String, String[]> mapName = new HashMap<>();

        for (String pair : keyValuePairs2) {
            String[] kv = pair.split(",");
            if (kv.length == 3) {
                String key = kv[0];
                String[] value = {kv[1], kv[2]};
                mapName.put(key, value);
            }
        }

        Map<String, String[]> resultMap = new HashMap<>();

        for (Map.Entry<String, String> entry : mapPrice.entrySet()) {
            String key = entry.getKey();
            String value1 = entry.getValue();

            if (mapName.containsKey(key)) {
                String[] values2 = mapName.get(key);
                resultMap.put(key, new String[]{values2[0], value1});
            }
        }

        File path = Path.of("resources", "result5.csv").toFile();
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
}
