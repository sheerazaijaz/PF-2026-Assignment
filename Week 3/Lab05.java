import java.util.Scanner;
public class Lab05 {

	public static void main(String[] args) {
		int i;
		int[]values= {34,71,12,98,45,23};
		int largest=values[0];
		
		for(i=1;i<values.length;i++) {
			if(values[i]>largest) {
				largest=values[i];
			}
		}
		System.out.println("Largest Value is: "+largest);

	}

}
