import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AveragePriceCSV {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\HP\\OneDrive\\Desktop\\Products.csv");

        List<String> lines = Files.readAllLines(path);

        int total = 0;
        int count = 0;

        for (int i = 1; i < lines.size(); i++) {

            String line = lines.get(i).trim();

            String[] parts = line.split(",");

            // Clean + convert to int
            String priceStr = parts[1]
                    .replace("\"", "")
                    .trim();

            int price = (int) Double.parseDouble(priceStr);

            total += price;
            count++;
        }

        int average = total / count;

        System.out.println("Average Price: " + average + " PKR");
        System.out.println("Number of Products: " + count);
    }
}