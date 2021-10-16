package src.basic.JavaStrings;

import java.util.StringTokenizer;

public class JavaStringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello everyone I am a Java developer", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
