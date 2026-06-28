public class function_overloading {
    public static int max(int a, int b) 
    {
        return (a > b) ? a : b;
    }
    
    public static double max(double a, double b) 
    {
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c) 
    {
        return max(max(a, b), c);
    }

    public static void main(String[] args) 
    {
        
        int result1 = max(5, 10); // Calls first version  
        System.out.println(result1);
          
        double result2 = max(5.5, 10.2); // Calls second version
        System.out.println(result2);

        int result3 = max(5, 10, 3); // Calls third version
        System.out.println(result3);
    }
}
