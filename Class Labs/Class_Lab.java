// 23/2/2026
// Multiplication Table Of An Ineteger

import java.util.Scanner;

public class Class_Lab {

    public static void printTable(int number) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printTable(num);
    }
}