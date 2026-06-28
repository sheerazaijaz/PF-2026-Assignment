// 23/2/2026
// Lab 02 - Print Matrix Function

public class Class_Lab_2 {

    public static void printMatrix(int[][] arr) {

        System.out.println("Matrix is:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + "   ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);
    }
}