package src.basic.JavaVariables;

public class Vars {

    public static void main(String[] args) {
        int x; // declaration
        x = 1; // assignment
        int y = 2; // initialization

        System.out.println(x);
        System.out.println(y);

        int xX = 3; // "x"
        int Xx = 3; // "X"
        int _x = 3; // "_"
        int $x = 3; // "$"

        System.out.println(xX + Xx + _x + $x); // 12
        
        // ?
        String a = "2";
        int b = 2;
        System.out.println(a + b + b); // 222
        System.out.println(b + b + a); // 42
    }
}