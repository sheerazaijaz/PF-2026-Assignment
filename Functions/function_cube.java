public class function_cube 
{
    public static int cube (int number){
        return number * number * number ;
    }
    public static void main(String[] args)
    {
        int result = cube (3); //3*3*3
        System.out.println("3 Cubed is :" + result );

        System.out.println("4 Cubed is : " + cube(4));
        System.out.println("6 Cubed is : " + cube(6));
    }
}