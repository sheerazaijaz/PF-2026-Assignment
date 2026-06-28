import java.io.FileWriter;
import java.io.IOException;

public class Task4OrderJsonYaml {

    public static void main(String[] args) throws IOException {

               // JSON FORMAT (String)
                String json =
                "{\n" +
                "  \"orderId\": 1001,\n" +
                "  \"customer\": {\n" +
                "    \"name\": \"Alice Johnson\",\n" +
                "    \"email\": \"alice@email.com\"\n" +
                "  },\n" +
                "  \"date\": \"2024-01-15\",\n" +
                "  \"items\": [\n" +
                "    {\"product\": \"Laptop\", \"quantity\": 2, \"price\": 1200},\n" +
                "    {\"product\": \"Mouse\", \"quantity\": 1, \"price\": 25}\n" +
                "  ],\n" +
                "  \"shippingAddress\": \"123 Main St, New York, NY 10001\",\n" +
                "  \"totalAmount\": 2425,\n" +
                "  \"paymentMethod\": \"Credit Card\",\n" +
                "  \"status\": \"Shipped\"\n" +
                "}";

        System.out.println("JSON:");
        System.out.println(json);

      
        // YAML FORMAT
        String yaml =
                "orderId: 1001\n\n" +

                "customer:\n" +
                "  name: Alice Johnson\n" +
                "  email: alice@email.com\n\n" +

                "date: 2024-01-15\n\n" +

                "items:\n" +
                "  - product: Laptop\n" +
                "    quantity: 2\n" +
                "    price: 1200\n\n" +
                "  - product: Mouse\n" +
                "    quantity: 1\n" +
                "    price: 25\n\n" +

                "shippingAddress: 123 Main St, New York, NY 10001\n" +
                "totalAmount: 2425\n" +
                "paymentMethod: Credit Card\n" +
                "status: Shipped\n";

        System.out.println("\nYAML:");
        System.out.println("Converted into YAMAL");
        System.out.println(yaml);

           }
}