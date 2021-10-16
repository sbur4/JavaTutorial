package src.basic.JavaPolymorphism.JavaOverloading;

public class Main {
    public static void main(String[] args) {
        System.out.println(Second.add(5, 3));
        System.out.println(Second.add2(5, 3, 1));
        System.out.println(Second.add3(1.5, 3.2));
    }


}

class Second {
    static int add(int a, int b) {
        return a + b;
    }

    static int add2(int a, int b, int c) {
        return a + b - c;
    }

    static double add3(double a, double b) {
        return a + b;
    }
}

