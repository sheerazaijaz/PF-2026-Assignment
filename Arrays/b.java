public class b {
    
    public static void changeValue(int num) {
        num = 100; // Only changes local copy
    }

    public static void changeArray(int[] arr) {
        arr[0] = 100; // Changes original array!
    }

    //VALUE TYPE
    public static void main(String[] args) {
    int x = 5;
    changeValue(x);
    System.out.println(x); // Still 5!
        
    //REFERENCE TYPE
    int[] numbers = {5};
    changeArray(numbers);
    System.out.println(numbers[0]); // 100!
    }
}