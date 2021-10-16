package src.basic.JavaMethods;

public class MethodOverloading {

    static int myMethod5(int myX, int myY) {
        return myX + myY;
    }

    static double myMethod5(double myX, double myY) {
        return myX + myY;
    }

    public static void main(String[] args) {
        int myNum1 = myMethod5(8, 5);
        double myNum2 = myMethod5(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}