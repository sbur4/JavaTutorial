package src.basic;

import java.util.Arrays;

public class JavaParallelSorting {
    public static void main(String[] args) {
        int[] a = {3, 6, 2, 9, 7, -1, 4, 0, -5};
        int[] b = {3, 6, 2, 9, 7, -1, 4, 0, -5};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.parallelSort(b);
        System.out.println(Arrays.toString(b));
    }
}
