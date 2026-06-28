import java.util.Scanner;
public class Lab08 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Before Reversing: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("\nAfter Reversing: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}

	}

}
