package src.basic.JavaStrings;

import java.util.Arrays;

public class Sort2Strings {
    public static void main(String[] args) {
        String original = "bdfac";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        String original2 = "dacfb";
        char[] chars2 = original2.toCharArray();
        Arrays.sort(chars2);
        String sorted2 = new String(chars);
        System.out.println(sorted == sorted2); // false
        System.out.println(sorted.equals(sorted2)); //true
    }
}
