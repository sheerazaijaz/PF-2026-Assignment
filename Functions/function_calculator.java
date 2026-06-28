public class function_calculator 
{
    public static double addition (double a , double b)
    {
        return a + b; 
    }

    public static double subtraction (double a , double b)
    {
        return a - b;
    }

    public static double multiplication (double a , double b)
    {
        return a * b;
    }

    public static double division (double a , double b)
    {
        if (b == 0)
            {
                System.out.println("Error : Can't divide by zero(0) ");
                return 0;
            }
            return a / b;
    }

    public static void main(String[] args) 
    {
        System.out.println("Addition of the numbers is : " + addition(10, 20));
        System.out.println("Subtraction of the numbers is : " + subtraction(10.5, 0.5));
        System.out.println("Multiplication of the numbers is : " + multiplication(12, 2.45));
        System.out.println("Division of the numbers is :" + division(10, 0));    
    }

}
