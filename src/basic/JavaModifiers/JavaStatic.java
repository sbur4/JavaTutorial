package src.basic.JavaModifiers;

public class JavaStatic {
    String s1 = "Error";
    static String s2 = "Ok";

    static {
        System.out.println("static block is invoked");
    }

    static String startOk(String s2) {
        return s2;
    }

    String startBad(String s1) {
        return s1;
    }

    static class NewStatic {
        String s3 = "Good";
    }

    public static void main(String[] args) {
        System.out.println(s2);
        NewStatic newStatic = new NewStatic();
        System.out.println(newStatic.s3);
    }
}
