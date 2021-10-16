package src.basic.JavaOperators.BinaryOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        // && Logical and
        // Returns true if both statements are true x < 5 && x < 10
        int ageS = 33;
        System.out.println(ageS < 35 && ageS > 31);
        System.out.println("\n");

        // || Logical or
        // Returns true if one of the statements is true x < 5 || x < 4
        int ageM = 28;
        System.out.println(ageM > 30 || ageM > 18);
        System.out.println("\n");

        // ! Logical not
        // Reverse the result, returns false if the result is true !(x < 5 // && x < 10)
        float ageBoston = 0.7f;
        System.out.println(!(ageBoston < 0.5 && ageBoston > 1));
        System.out.println("\n");
    }

}
