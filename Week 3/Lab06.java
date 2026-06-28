import java.util.Scanner;
public class Lab06 {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8};
		int EvenCount=0;
		int OddCount=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				EvenCount++;
			}else {
				OddCount++;
			}
		}
		System.out.println("Even Numbers: "+EvenCount);
		System.out.println("Odd Numbers: "+OddCount);

	}

}
