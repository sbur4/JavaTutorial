package src.basic.IO;

import java.util.Date;

public class JavaPrintF {
    public static void main(String[] args) {
        // %c - Character
        System.out.printf("%c", 'H');
        System.out.printf("\n");
        // %d - Decimal number (base 10)
        System.out.printf("%d", 159);
        System.out.printf("\n");
        // %e - Exponential floating-point number
        System.out.printf("%e", 1.59E+01);
        System.out.printf("\n");
        // %f - Floating-point number
        System.out.printf("%f", 15.9);
        System.out.printf("\n");
        // %s - String
        System.out.printf("%S", "Hello");
        System.out.printf("\n");
        // %t - Date/time
        System.out.printf("%tc", new Date());

    }
}