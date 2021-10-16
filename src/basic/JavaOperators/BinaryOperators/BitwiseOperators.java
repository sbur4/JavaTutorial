package src.basic.JavaOperators.BinaryOperators;

public class BitwiseOperators {
    public static void main(String[] args) {

        int second = 5;
        int third = 6;
        second &= 3; // x &= 3 => x = x & 3
        // побитовое И (AND) с присваиванием
        third &= 3;
        System.out.print("second 5&3 = " + second + "\n");
        System.out.print("third 6&3 = " + third + "\n");
        System.out.print("\n");

        int fourth = 1;
        fourth |= 2; // x |= 2 => x = x | 2 => 1 OR 2 = 3 (1<2=1+2)
        // побитовое ИЛИ (OR) с присваиванием
        System.out.print("fourth 1|2 = " + fourth + "\n");
        int fifth = 3;
        fifth |= 2; // x |= 2 => x = x | 2 => 3 OR 2 = 3 (3>2=3)
        System.out.print("fifth 3|2 = " + fifth + "\n");
        int sixth = 4;
        sixth |= 4; // x |= 4 => x = x | 4 => 4 OR 4 = 4 (4=4)
        System.out.print("sixth 4|4 = " + sixth + "\n");
        System.out.print("\n");

        int seventh = 3;
        seventh ^= 2; // x ^= 2 => x = x ^ 2 => 3 XOR 2 = 1 (3+2)
        seventh ^= 4; // (1+4)
        // побитовое исключающее ИЛИ (XOR) с присваиванием
        System.out.print("seventh ^=2 " + seventh + "\n");
        System.out.print("seventh ^=4 " + seventh + "\n");
        System.out.print("\n");

        int eighth = 1;
        eighth >>= 2; // x >>= 2 => x = x >> 2
        // сдвиг вправо с присваиванием
        System.out.print("eighth >>=2 " + eighth + "\n");
        System.out.print("\n");

        int ninth = 2;
        ninth >>>= 1; // 1 >>>= 2 (2-1)
        // сдвиг вправо с заполнением нулями с присваиванием
        System.out.print("ninth >>>= 2 " + ninth + "\n");
        System.out.print("\n");

        int tenth = 3;
        tenth <<= 2; // x <<= 3 => x = x << 3
        // сдвиг влево с присваиванием
        System.out.print("tenth <<= 2 " + tenth + "\n");
        System.out.print("\n");

        int eleven = ~8;
        int twelve = ~eleven;
        // побитовое унарное отрицание (NOT). Все биты в x меняются на противоположные
        System.out.print("eleven = ~8 " + eleven + "\n");
        System.out.print("eleven = ~7 " + twelve + "\n");
        System.out.print("\n");
    }
}