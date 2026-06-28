import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class studentsgpa {

    public static void main(String[] args) throws IOException {

        // Input and Output file paths
        Path inputPath = Path.of("C:\\Users\\HP\\OneDrive\\Desktop\\students.scv.csv");

        Path outputPath = Path.of("C:\\Users\\HP\\OneDrive\\Desktop\\honor_students.csv");

        // Read all lines from input CSV
        List<String> lines = Files.readAllLines(inputPath);

        // StringBuilder to store filtered data
        StringBuilder filteredData = new StringBuilder();

        // Add header line
        filteredData.append(lines.get(0)).append("\n");

        // Loop through remaining lines
        for (int i = 1; i < lines.size(); i++) {

            String line = lines.get(i);

            // Split CSV columns
            String[] data = line.split(",");

            // GPA is in column index 3
            double gpa = Double.parseDouble(data[3]);

            // Check GPA condition
            if (gpa >= 3.5) {
                filteredData.append(line).append("\n");
            }
        }

        // Write filtered data to new CSV file
        Files.writeString(outputPath, filteredData.toString());

        System.out.println("Filtered CSV file created successfully!");
        System.out.println("Output File: " + outputPath);
    }
}