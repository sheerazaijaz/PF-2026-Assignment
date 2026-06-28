import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=read.nextInt();
		if (isPrime(num)) {
	        System.out.println(num + " is Prime");
	    } else {
	        System.out.println(num + " is Not Prime");
	    }
	}
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<= num/2;i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
		
	}
	

}
