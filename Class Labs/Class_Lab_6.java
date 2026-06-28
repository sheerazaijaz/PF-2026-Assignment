// 10/3/2026

public class Class_Lab_6 {

    public static void main(String[] args) {
//        dataType[] arrayName = new dataType[size];
//        int[] numbers = {1, 2, 3, 4, 5}; // @123eb
//        int[] numbers2 = numbers; // @123eb
//        squareArray(numbers); // @123eb[0] = 100;
//        printArray(numbers);
//        printArray(numbers2);
        int a = 1;
        displayInt(8);
    }
    static void displayInt(int a){
//        int a = 8
        System.out.println(a);
    }
    static void demonstrateBlockScope(){
        int x =10;
        if (x>5){
            int y = 20;
            System.out.println(x);
            System.out.println(y);
        }
        int y =0;
        System.out.println(x);
        System.out.println(y);
    }
    
    static void increment(int x){
        // statement1
        // statement2
        x+=1;

        // statement3
    }
    void function1(){
        int b = 1;
//        function2(5);
    }

    
}