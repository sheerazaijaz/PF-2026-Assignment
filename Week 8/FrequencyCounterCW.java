import java.util.HashMap;
import java.util.Map;

public class FrequencyCounterCW {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 3, 6, 1};
               
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : numbers) {
           
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
             
        System.out.println("OUTPUT:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}