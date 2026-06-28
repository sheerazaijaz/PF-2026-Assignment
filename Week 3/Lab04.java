import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Number Of Subject: ");
		int n = read.nextInt();
		int marks[]=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Marks Of Subject:"+(i+1)+":");
			marks[i]=read.nextInt();
			sum=sum+marks[i];
		}
		double average= (double)sum/n;
		System.out.println("Total Marks: "+sum);
		System.out.println("Average Marks: "+average);
		
	}

}
