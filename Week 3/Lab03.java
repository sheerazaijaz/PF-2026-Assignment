import java.util.Scanner;
public class Lab03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int A[][]= new int[3][3];
		int B[][]= new int[3][3];
		int C[][]= new int[3][3];
		
		System.out.println("Enter elements of Matrix A:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				A[i][j]=read.nextInt();
			}
		}
		System.out.println("Enter Elements of Matrix B:");
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				B[i][j]=read.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.println("Resultant Matrix C(A+B):");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(C[i][j]+"");
			}
			System.out.println();
		}

	}

}
