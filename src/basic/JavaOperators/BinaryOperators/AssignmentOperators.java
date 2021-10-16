package src.basic.JavaOperators.BinaryOperators;

public class AssignmentOperators {

    public static void main(String[] args) {
        // Assignment operators - the assignment operator (=)
        int first = 1;
        System.out.print("first = " + first + "\n");
        first += 3;
        System.out.print("first +3 = " + first + "\n");
        first -= 2;
        System.out.print("first -2 = " + first + "\n");
        first *= 3;
        System.out.print("first *3 = " + first + "\n");
        first /= 2;
        System.out.print("first /2 = " + first + "\n");
        int second = 5 * 4 % 3; // (5*4)-3*6= 20-18 => 2
        System.out.print("second = 5 * 4 % 3 = " +  second + "\n");
        System.out.print("\n");
    }

}
