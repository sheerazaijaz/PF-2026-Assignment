import java.util.Arrays;

public class e {
    public static void main(String[] args) {
        
        int[] original = {1, 2, 3};
        // int[] copy = Arrays.copyOf(original, original.length);

        // Manually:
         int[] copy = new int[original.length];

         for (int i = 0; i < original.length; i++) {
             copy[i] = original[i];
         }
         
        System.out.println("Original : " + Arrays.toString(original));
        System.out.println("Copy : " + Arrays.toString(copy));
    }

}
