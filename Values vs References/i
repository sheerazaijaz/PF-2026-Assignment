import java.util.Arrays;

public class ValueVsReference_MethodParameter {

    public static void main(String[] args) {

        //SECTION 3: METHOD PARAMETERS
        System.out.println("\n--- METHOD PARAMETER DEMONSTRATION ---");
       
       
        System.out.println("In term of values (unchanged)");
        int x = 50;
        modifyValue(x);
        System.out.println("Primitive x after method: " + x); // Output: 50 (Unchanged)
       
       
        System.out.println("In term of references (changed)");
        int[] y = {50};
        modifyReference(y);
        System.out.println("Array y[0] after method: " + y[0]); // Output: 100 (Changed)
    }

    // Pass-by-value: Java copies the value of the primitive
    static void modifyValue(int num) {
        num = 100; // This only changes the local copy inside this method
    }

    // Pass-by-value: Java copies the memory address
    // The method accesses the same object on the heap.
    static void modifyReference(int[] arr) {
        arr[0] = 100; // This modifies the original object
    }
}
