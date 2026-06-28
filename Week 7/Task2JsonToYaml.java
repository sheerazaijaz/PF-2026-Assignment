import java.io.FileWriter;
import java.io.IOException;

public class Task2JsonToYaml {

    public static void main(String[] args) throws IOException {

               // JSON FORMAT (String)
              String json = "[\n" +
                "  {\"name\": \"John Smith\", \"department\": \"IT\", \"salary\": 75000, \"startDate\": \"2020-01-15\", \"skills\": [\"Java\", \"Python\", \"SQL\"]},\n" +
                "  {\"name\": \"Sarah Johnson\", \"department\": \"HR\", \"salary\": 65000, \"startDate\": \"2019-03-01\", \"skills\": [\"Recruitment\", \"Training\"]}\n" +
                "]";

        System.out.println("JSON:");
        System.out.println(json);

              // YAML OUTPUT
              String yaml =
                "- name: John Smith\n" +
                "  department: IT\n" +
                "  salary: 75000\n" +
                "  startDate: 2020-01-15\n" +
                "  skills:\n" +
                "    - Java\n" +
                "    - Python\n" +
                "    - SQL\n\n" +

                "- name: Sarah Johnson\n" +
                "  department: HR\n" +
                "  salary: 65000\n" +
                "  startDate: 2019-03-01\n" +
                "  skills:\n" +
                "    - Recruitment\n" +
                "    - Training\n";

        // Print YAML
        System.out.println("\nYAML:");
        System.out.println("Converted into YAML");
        System.out.println(yaml);

        }
}