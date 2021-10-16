package src.basic.JavaCastingType;

/*
In Java, there are two types of casting:
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
*/

public class CastingType {

    public static void main(String[] args) {
        int castingType1 = 5;
        System.out.println(castingType1);
        System.out.println("\n");

        Integer x = new Integer(33);
        System.out.println(x instanceof Integer);
    }

}
