// 17/3/2026

// Create ArrayHelper class that include three functions 
// 1. copy (to copy an array)
// 2. equals  (to compare two arrays)
// 3. print to print array

import java.util.Arrays;

public class h {

    public static int a = 0;

    public static int[] copy(int[] arr){
        int[] dup = new int[arr.length];
        for (int i = 0; i<arr.length; i++){
            dup[i] = arr[i];
        }
        return dup;
    }

    public static boolean equals(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i =0; i<arr2.length; i++){
            if (arr2[i] != arr1[i]){
                return false;
            }
        }
        return true;
    }

    public static void print(int[] arr){
        for (int i =0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

      // MAIN METHOD (to show output)
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] copied = copy(arr);

        System.out.println("Original: " + Arrays.toString(arr));
        // print(arr);

        System.out.println("Copied: " + Arrays.toString(copied));
        // print(copied);

        System.out.println("Are equal: " + equals(arr, copied));
    }
}