import java.util.Scanner;
public class Lab02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int matrix[][]= new int[3][3];
		int transpose[][]= new int[3][3];
		System.out.println("Enter Elements of Matrix: ");
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				matrix[i][j]=read.nextInt();
			}
		}
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				transpose[i][j]=matrix[j][i];
			}
		}
		System.out.println("Original Matrix: ");
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.println(matrix[i][j]+"");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix: ");
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.println(transpose[i][j]+"");
			}
			System.out.println();
		}

	}

}
