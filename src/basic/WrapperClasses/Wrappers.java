package src.basic.WrapperClasses;

public class Wrappers {
    public static void main(String[] args) {
        int x = 3;
        Integer y = 5;
        // autoboxing
        x = y; // ->5
        System.out.println(x);
        // autounboxing
        x = y * 3;// ->15
        System.out.println(x);
        System.out.println("\n");

        /*
         * Byte a; Short b; Integer c; Long d; Float e; Double f; Character g;
         */
    }
}
