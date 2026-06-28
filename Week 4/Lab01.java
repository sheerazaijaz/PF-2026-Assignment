import java.util.Scanner;
public class Lab01 {

	public static void main(String[] args) {
		int[][]arr= {
				{1,2,3},
				{4,5,6}
		};
		int[][]arr2= {
				{2,4,8},
				{3,5,7}
		};
		int[][] result= addMatrix(arr,arr2);
		

	}
	static int[][] addMatrix(int[][] arr,int[][] arr2){
		int[][] result=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				result[i][j]=arr[i][j]+arr2[i][j];
			}

		}
		System.out.println("Resultant Matrix: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		return result;

	
	}

}
