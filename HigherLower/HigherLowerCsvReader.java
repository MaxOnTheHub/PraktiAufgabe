import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HigherLowerCsvReader
{

    public static List<Youtuber> readYoutubersFromCsv()
    {
        Path path = Path.of("HigherLower", "data.csv");
        if (!Files.exists(path)) {
            path = Path.of("data.csv");
        }
        List<Youtuber> kanaele = new ArrayList<>();
        try (Scanner csv = new Scanner(path, StandardCharsets.UTF_8)) {
            csv.nextLine();
            while (csv.hasNextLine()) {
                String zeile = csv.nextLine();
                if (zeile.isBlank()) {
                    continue;
                }

                String[] spalten = zeile.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                int nameIndex = spalten.length - 4;
                String abonnenten = spalten[nameIndex + 2].trim();
                if (abonnenten.isEmpty() || abonnenten.equals("--")) {
                    continue;
                }

                String name = spalten[nameIndex].trim();
                if (name.startsWith("\"") && name.endsWith("\"")) {
                    name = name.substring(1, name.length() - 1).replace("\"\"", "\"");
                }
                kanaele.add(new Youtuber(name, Long.parseLong(abonnenten)));
            }
        } catch (Exception e)
        {

        }
        return kanaele;
    }
}
