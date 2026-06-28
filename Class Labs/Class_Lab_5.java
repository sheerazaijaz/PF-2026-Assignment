// 24/2/2026
// LAB 05 - Matrix Operations

import java.util.Scanner;

public class Class_Lab_5 {

    // Function to add matrices
    public static void addMatrix(int[][] a, int[][] b) {

        int[][] sum = new int[3][3];

        System.out.println("Addition of Matrices:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                sum[i][j] = a[i][j] + b[i][j];

                System.out.print(sum[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Function to subtract matrices
    public static void subtractMatrix(int[][] a, int[][] b) {

        int[][] sub = new int[3][3];

        System.out.println("Subtraction of Matrices:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                sub[i][j] = a[i][j] - b[i][j];

                System.out.print(sub[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Function to transpose matrix
    public static void transposeMatrix(int[][] a) {

        System.out.println("Transpose of Matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(a[j][i] + " ");
            }

            System.out.println();
        }
    }

    // Function to check symmetric matrix
    public static boolean isSymmetric(int[][] a) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Function to find sum of diagonal elements
    public static int diagonalSum(int[][] a) {

        int sum = 0;

        for (int i = 0; i < 3; i++) {

            sum = sum + a[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        System.out.println("Enter elements of first matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("  ");

        addMatrix(matrix1, matrix2);
        System.out.println();

        subtractMatrix(matrix1, matrix2);
        System.out.println();

        transposeMatrix(matrix1);
        System.out.println();

        if (isSymmetric(matrix1)) {

            System.out.println("Matrix is Symmetric");

        } else {

            System.out.println("Matrix is not Symmetric");
        }

        System.out.println();

        System.out.println("Sum of diagonal elements: " + diagonalSum(matrix1));
    }
}