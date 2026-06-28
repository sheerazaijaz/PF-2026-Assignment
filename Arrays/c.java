public class c {
    

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside: a=" + a + ", b=" + b);
    }

    public static void main(String [] args){

    int x = 5, y = 10;
    swap(x, y); // Inside: a=10, b=5
    System.out.println("Outside: x=" + x + ", y=" + y); // x=5, y=10

    }
}