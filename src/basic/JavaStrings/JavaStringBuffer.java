package src.basic.JavaStrings;

import java.lang.StringBuffer;

public class JavaStringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        // append
        sb.append(" ");
        sb.append("java");
        System.out.println(sb);
        // insert
        sb.insert(10, "!");
        System.out.println(sb);
        // replace
        sb.replace(6, 13, "world");
        System.out.println(sb);
        // delete
        sb.delete(11, 12);
        System.out.println(sb);
        // reverse
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        // capacity
        System.out.println(sb.capacity());
        // ensureCapacity
        sb.ensureCapacity(25);
        System.out.println(sb);
        // charAt
        System.out.println(sb.charAt(4));
        // length
        System.out.println(sb.length());
        // substring
        System.out.println(sb.substring(3, 8));
    }
}
