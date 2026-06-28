import java.util.Scanner;
public class Lab03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result= max (a=6,b=8,c=3);
		System.out.println(result);
	}
	static int add(int a,int b) {
		System.out.println("int add");
		return a+b;
	}
	static double add(double a,double b) {
		System.out.println("double add");
		return a+b;
	}
	static int subtract(int a,int b) {
		System.out.println("int subtract");
		return a-b;
	}
	static double subtract(double a,double b) {
		System.out.println("double subtract");
		return a-b;
	}
	static int multiply(int a, int b) {
		System.out.println("int multiply");
		return a*b;
	}
	static double multiply(double a, double b) {
		System.out.println("double multiply");
		return a*b;
	}
	static int divide(int a, int b) {
		System.out.println("int divide");
		return a/b;
	}
	static double div(double a, double b) {
		System.out.println("double divide");
		if(b !=0) {
			return a/b;
		}else {
			System.out.println("Invalid Input!");
			return 0;
		}	
	}
	static int max(int a, int b) {
		System.out.println("Max integer value among two parameters");
		if(a>=b) {
			return a;
		}else {
			return b;
		}
	}
	static double max(double a, double b) {
		System.out.println("Max double value among two parameters");
		if(a>=b) {
			return a;
		}else {
			return b;
		}
	}
	static int max(int a, int b, int c) {
		System.out.println("Max int value among three parameters");
		if(a>=b && a>=c) {
			return a;
		}else if(b>=a && b>=c) {
			return b;
		}else {
			return c;
		}
	}
	static double max(double a, double b, double c) {
		System.out.println("Max double value among three parameters");
		if(a>=b && a>=c) {
			return a;
		}else if(b>=a && b>=c) {
			return b;
		}else {
			return c;
		}
	}

}
