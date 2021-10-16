package src.basic.JavaArray;

import java.util.Arrays;

public class ArrayToStringVsDeepToString {
    static int[] arr1 = { 1, 2, 3 };
    static int[] arr2 = { 4, 5 };
    static int[][] arr3 = { arr1, arr2 };

    public static void main(String[] args) {
        
        System.out.print("Array to string: " + Arrays.toString(arr1) + "\n");
        System.out.print("Array to string: " + Arrays.toString(arr3) + "\n");
        System.out.print("Array to string: " + Arrays.deepToString(arr3) + "\n");
    }

}
