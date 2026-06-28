import java.util.Scanner;
public class Lab01 {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("Enter The Size Of Array: ");
		int size=read.nextInt();
		int arr[]= new int[size];
		int sum=0;
		for(int i=0 ; i<size ; i++) {
			System.out.println("Enter elements at index"+ i +":");
			arr[i]=read.nextInt();
		}
		for(int i=0 ; i<size ; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum Of array Elements: "+sum);
		read.close();

	}

}
