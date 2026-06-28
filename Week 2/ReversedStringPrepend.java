import java.util.Scanner;
public class ReversedStringPrepend {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i;
		System.out.println("Enter a String: ");
		String str=read.nextLine();
		String reversed="";
		
		for(i=0;i<str.length();i++) {
			reversed=str.charAt(i)+reversed;
		}
		System.out.println("Reversed String: "+reversed);

	}

}
