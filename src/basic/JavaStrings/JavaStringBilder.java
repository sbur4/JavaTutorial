package src.basic.JavaStrings;

import java.lang.StringBuilder;

public class JavaStringBilder {

    public static void main(String[] args) {

        StringBuilder my = new StringBuilder("Hello");
        // append
        my.append(" ");
        my.append("java");
        System.out.println(my);
        my.append(" ");
        my.append(15);
        System.out.println(my);
        // insert
        my.insert(13, "!");
        System.out.println(my);
        // replace
        my.replace(6, 13, "world");
        System.out.println(my);
        // delete
        my.delete(11, 12);
        System.out.println(my);
        // reverse
        my.reverse();
        System.out.println(my);
        my.reverse();
        // capacity
        System.out.println(my.capacity());
        // ensureCapacity - emkost6
        my.ensureCapacity(25);
        // System.out.println(my);
        // charAt
        System.out.println(my.charAt(4));
        // length
        System.out.println(my.length());
        // substring
        System.out.println(my.substring(3, 8));
    }
}
