import java.util.Scanner;
public class Lab05 {

	public static void main(String[] args) {
		int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println("Addition:");
        printMatrix(add(matrix1, matrix2));

        System.out.println("\nSubtraction:");
        printMatrix(subtract(matrix1, matrix2));

        System.out.println("\nTranspose of Matrix1:");
        printMatrix(transpose(matrix1));

        System.out.println("\nIs Matrix1 Symmetric? " + isSymmetric(matrix1));

        System.out.println("\nDiagonal Sum of Matrix1: " + diagonalSum(matrix1));

	}
	static int[][] add(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    static boolean isSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows != cols) {
            return false;
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    static int diagonalSum(int[][] matrix) {
        int sum = 0;

        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
