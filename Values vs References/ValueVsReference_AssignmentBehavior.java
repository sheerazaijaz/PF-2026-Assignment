import java.util.Arrays;

public class ValueVsReference_AssignmentBehavior {

    public static void main(String[] args) {
        
        //SECTION 1: VALUE TYPES 
        int a = 5;
        int b = a; // b gets a COPY of the value 5
        b = 10;    // Changing b does NOT affect a
        
        System.out.println("Value Type Assignment:");
        System.out.println("Variable a: " + a); // Output: 5
        System.out.println("Variable b: " + b); // Output: 10

        //SECTION 2: REFERENCE TYPES 
        int[] arr1 = {5};
        int[] arr2 = arr1; // arr2 gets a COPY of the REFERENCE (memory address)
        arr2[0] = 10; // Changing the object via arr2 affects arr1.
        
        System.out.println("Reference Type Assignment:");
        System.out.println("arr1[0]: " + arr1[0]); // Output: 10 (Changed)
        System.out.println("arr2[0]: " + arr2[0]); // Output: 10

    } 
} 
