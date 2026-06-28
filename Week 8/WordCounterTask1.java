import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounterTask1 {
    public static void main(String[] args) {
               String input = "the cat and the dog and the bird";
        
          String[] words = input.split(" ");
               
        Map<String, Integer> wordMap = new LinkedHashMap<>();
          
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
          
        System.out.println("Expected Output:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}