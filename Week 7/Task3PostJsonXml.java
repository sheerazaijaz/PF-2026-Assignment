import java.io.FileWriter;
import java.io.IOException;

public class Task3PostJsonXml {

    public static void main(String[] args) throws IOException {

          // JSON FORMAT
               String json =
                "{\n" +
                "  \"user\": \"Alice\",\n" +
                "  \"post\": \"Just finished my Java project!\",\n" +
                "  \"date\": \"2024-01-20\",\n" +
                "  \"time\": \"15:45\",\n" +
                "  \"likes\": {\n" +
                "    \"count\": 15,\n" +
                "    \"users\": [\"Bob\", \"Charlie\", \"Diana\"]\n" +
                "  },\n" +
                "  \"comments\": [\n" +
                "    {\"user\": \"Bob\", \"comment\": \"Great work!\"},\n" +
                "    {\"user\": \"Charlie\", \"comment\": \"Congratulations!\"},\n" +
                "    {\"user\": \"Diana\", \"comment\": \"Well done, Alice!\"}\n" +
                "  ],\n" +
                "  \"tags\": [\"programming\", \"java\"]\n" +
                "}";

        System.out.println("JSON:");
        System.out.println(json);

              // XML FORMAT
              String xml =
                "<post>\n" +
                "  <user>Alice</user>\n" +
                "  <message>Just finished my Java project!</message>\n" +
                "  <date>2024-01-20</date>\n" +
                "  <time>15:45</time>\n" +
                "\n" +
                "  <likes>\n" +
                "    <count>15</count>\n" +
                "    <users>\n" +
                "      <user>Bob</user>\n" +
                "      <user>Charlie</user>\n" +
                "      <user>Diana</user>\n" +
                "    </users>\n" +
                "  </likes>\n" +
                "\n" +
                "  <comments>\n" +
                "    <comment>\n" +
                "      <user>Bob</user>\n" +
                "      <text>Great work!</text>\n" +
                "    </comment>\n" +
                "    <comment>\n" +
                "      <user>Charlie</user>\n" +
                "      <text>Congratulations!</text>\n" +
                "    </comment>\n" +
                "    <comment>\n" +
                "      <user>Diana</user>\n" +
                "      <text>Well done, Alice!</text>\n" +
                "    </comment>\n" +
                "  </comments>\n" +
                "\n" +
                "  <tags>\n" +
                "    <tag>programming</tag>\n" +
                "    <tag>java</tag>\n" +
                "  </tags>\n" +
                "</post>";

        System.out.println("\nXML:");
        System.out.println("Coverted into XML");
        System.out.println(xml);

            }
}