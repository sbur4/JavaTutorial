package src.basic.JavaStrings;

public class JavaComparisonString {

    public static void main(String[] args) {
        String a, b;
        a = "abc";
        b = a;
        System.out.println(a == b); //true
        b = new String("abc");
        System.out.println(a == b);  //false
        System.out.println(a.equals(b));  //true
        System.out.println(a.compareTo(b));  //0
    }
}
