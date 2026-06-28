import java.io.FileWriter;
import java.io.IOException;

public class Task1JsonCsv {

    public static void main(String[] args) throws IOException {

        // JSON FORMAT
        String json = "[\n" +
                "  {\"product\": \"Laptop\", \"price\": 1200, \"stock\": 15},\n" +
                "  {\"product\": \"Mouse\", \"price\": 25, \"stock\": 50},\n" +
                "  {\"product\": \"Keyboard\", \"price\": 75, \"stock\": 30}\n" +
                "]";

        System.out.println("JSON:");
        System.out.println(json);

        // CSV FORMAT (PRINT)
    
        String csvHeader = "product,price,stock";
        String row1 = "Laptop,1200,15";
        String row2 = "Mouse,25,50";
        String row3 = "Keyboard,75,30";

        // PRINT CSV OUTPUT
        System.out.println("\nCSV:");
        System.out.println("Converted into CSV");
        System.out.println(csvHeader);
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);

    }
}