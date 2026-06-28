import java.util.Scanner;
public class PrintTable {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int num;
		System.out.println("Enter a number: ");
		num=read.nextInt();
		printTable(num);
	}
	static void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
		System.out.println();
	}

}
