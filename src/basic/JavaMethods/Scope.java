package src.basic.JavaMethods;

public class Scope {

    public static void main(String[] args) {

        // Code here CANNOT use x

        int x = 5;

        // Code here can use x

        System.out.println(x);
    }
}
