// 23/2/2026
// Lab 03 - Calculator Class with Overloaded Functions

public class Class_Lab_3 {

    // Addition for integers
    public int add(int a, int b) {
        return a + b;
    }

    // Addition for double values
    public double add(double a, double b) {
        return a + b;
    }

    // Max between two numbers
    public int max(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Max among three numbers
    public int max(int a, int b, int c) {

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {

        Class_Lab_3 obj = new Class_Lab_3();

        System.out.println("Integer Addition: " + obj.add(5, 4));

        System.out.println("Double Addition: " + obj.add(2.5, 3.7));

        System.out.println("Max between two numbers: " + obj.max(10, 20));

        System.out.println("Max among three numbers: " + obj.max(5, 15, 8));
    }
}
