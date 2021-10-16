package src.basic.JavaOperators.BinaryOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int x = 1;
        int y = 3;
        int z = 5;
        System.out.println(x + y); // 1+3
        System.out.println(z - y); // 5-3
        System.out.println(x * y); // 1*3
        System.out.println("int z / y = " + z / y);// 5/3
        float yY = 3;
        float zZ = 5;
        System.out.println("float z / y = " + zZ / yY + "\n");// 5/3

        int sum1 = y + z;// 3+5
        double sum2 = zZ / yY;// 5/3
        double xX = 1;
        double sum3 = xX % yY; // 1%3
        System.out.println(sum1);
        System.out.println("z / y double = " + sum2);
        System.out.println("Returns the division remainder = " + sum3 + "\n");
    }
}
