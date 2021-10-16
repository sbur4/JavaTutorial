package src.basic.JavaStrings;

public class CreateString {
    public static void main(String[] args) {
        char[] ch = {'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
        String s1 = new String(ch);
        String s2 = "javatpoint";
        System.out.println(s1 + "\n" + s2);
        /*String objects are immutable. Immutable simply means unmodifiable or unchangeable.*/
//        String s1 = "error";

        String s3 = "Serhii";
        s3.concat(" Burch");
        System.out.println(s3);

        String s4 = "Serhii";
        s4 = s4.concat(" Burch");
        System.out.println(s4);
    }
}
