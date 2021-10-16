package src.basic.JavaStrings;

import java.util.Arrays;

public class StringDivideToParts {
    public static void main(String[] args) {
        String str = "Is a test";
        String[] stArr = str.split("\\s",5 );
        System.out.println(Arrays.toString(stArr));
    }
}
