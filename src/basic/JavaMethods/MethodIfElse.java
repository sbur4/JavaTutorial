package src.basic.JavaMethods;

public class MethodIfElse {

    static void myMethod4(int num) {
        if (num < 30) {
            System.out.println("is False");
        } else {
            System.out.println("is True");
        }
    }

    public static void main(String[] args) {
        myMethod4(33);
    }
}