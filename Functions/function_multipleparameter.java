public class function_multipleparameter
{
    // FUNCTIONS
    public static int add(int a, int b) 
    {
        return a + b;
    }

    public static double calculateArea(double length, double width) 
    {
        return length * width;
    }

    public static void printFullName(String firstName, String lastName)
    {
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args)
    {
    
        // Using these methods:

        //Add
        int sum = add(10 , 20); // 30
        System.out.println("ADDITION OF THESE NUMBERS IS: " + sum);

        //Area
        double area = calculateArea(5.5, 3.2); // 17.6
        System.out.println("AREA IS : " + area);

        //Full Name
        printFullName("Sheeraz", "Aijaz"); // Sheeraz Aijaz
    }
}