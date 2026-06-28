import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter numbers to add (Enter 0 to stop):");

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;  // Exit loop if user enters 0
            }

            sum += number;  // Add number to sum
        }

        System.out.println("Total sum = " + sum);
    }
}
