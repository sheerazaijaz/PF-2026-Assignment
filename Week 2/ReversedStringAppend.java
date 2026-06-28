import java.util.Scanner;
public class ReversedStringAppend {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i;
		System.out.println("Enter a String: ");
		String str= read.nextLine();
		String reversed="";
		
		for(i=str.length()-1;i>=0;i--) {
			reversed=reversed+str.charAt(i);
		}
		System.out.println("Reversed String: "+reversed);

	}

}
