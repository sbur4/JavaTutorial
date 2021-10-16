package src.basic.JavaArray;

import java.util.Arrays;

public class JavaSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5, 3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        char[] b = {'b', 'a', 'd', 'c', 'e'};
        Arrays.parallelSort(b, 0, 3);
        System.out.println(Arrays.toString(b));


    }
}
