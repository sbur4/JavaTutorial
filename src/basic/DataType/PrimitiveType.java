package src.basic.DataType;

public class PrimitiveType {
    // Logical Primitive Type - boolean
    static boolean dataType1 = true;
    // Literal Primitive Type - char
    static char dataType3 = 'A';
    // Numerical Primitive Type
    // Whole Numbers - byte, short, int, long, char
    // Stores whole numbers from -128 to 127
    static byte dataType5 = 1;
    // Stores whole numbers from -32768 to 32767
    static short dataType6 = 22222;
    // Stores whole numbers from -2147483648 to 2147483647
    static int dataType7 = 333333333;
    // Stores whole numbers from -922337236854775808 to
    // 9223372036854775807
    static long dataType8 = 922337236854775808l;
    public static char dataType10 = 77;
    // Floating Point Numbers - float, double
    // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    static float dataType11 = 8.88f;
    // Stores fractional numbers. Sufficient for storing 15 decimal digits
    static double dataType13 = 9.99d;

    public static void main(String[] args) {
        boolean dataType2 = false;

        char[] dataType4 = { 'B', 'U', 'R', 'C', 'H' };
        String dataType4String = String.valueOf(dataType4);

        long dataType9 = -922337236854775808L;
        float dataType12 = 8.99F;
        double dataType14 = 9.99D;
        double dataType15 = 7.77;

        // var dataType16 = 10;
        // var dataType17 = "Hello world";

        System.out.println("Logical Primitive Type - boolean = " + dataType1);
        System.out.println(dataType2);
        System.out.println("\n");
        System.out.println("Literal Primitive Type - char = " + dataType3);
        System.out.println("char[] = " + dataType4String);
        System.out.println("\n");
        System.out.println("Whole Numbers - byte = " + dataType5);
        System.out.println("short = " + dataType6);
        System.out.println("int = " + dataType7);
        System.out.println("long = " + dataType8);
        System.out.println("Long = " + dataType9);
        System.out.println("char= " + dataType10);
        System.out.println("\n");
        System.out.println("Floating Point Numbers - float = " + dataType11);
        System.out.println("Float = " + dataType12);
        System.out.println("double = " + dataType13);
        System.out.println("Double = " + dataType14);
        System.out.println("Double = " + dataType15);
        System.out.println("\n");
        // System.out.println("var = " + dataType16);
        // System.out.println("var = " + dataType17);
        // System.out.println("\n");
    }
}