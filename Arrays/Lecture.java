// 17/3/2026
// To read a file from desktop

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lecture {

    public static void main(String[] args) throws Exception {

        Path filePath = Path.of("C:/Users/BINARY COMPUTERS/OneDrive/Desktop/JAVA CODES/Arrays/students.csv");
        String fileContent = Files.readString(filePath);

        String[] rows = fileContent.split("\n");

        // create output file
        PrintWriter writer = new PrintWriter("honor_students.csv");

        // write header
        writer.println(rows[0]);

        // loop from row 1 (skip header)
        for (int i = 1; i < rows.length; i++) {

            String row = rows[i];
            String[] columns = row.split(",");

            double gpa = Double.parseDouble(columns[3]);

            if (gpa >= 3.5) {
                writer.println(row);
            }
        }

        writer.close();

        System.out.println("File created: honor_students.csv");
    }
}