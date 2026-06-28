public class function_square {
// Method that takes an integer and returns its square
public static int square(int number) {
return number * number;
}
public static void main(String[] args) {
int result = square(5);
System.out.println("5 squared is: " + result);
// We can call it multiple times
System.out.println("3 squared is: " + square(3));
System.out.println("10 squared is: " + square(10));
}
}
