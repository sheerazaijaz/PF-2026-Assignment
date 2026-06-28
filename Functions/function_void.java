public class function_void {
    public static void printMultiplicationTable(int number) 
    {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) 
            {
                System.out.println(number + " x " + i + " = " + (number*i));
            }
    }
    
    public static void main(String[] args) {
       printMultiplicationTable(10);
    }
}
