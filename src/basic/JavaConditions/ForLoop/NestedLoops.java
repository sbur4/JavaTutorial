package src.basic.JavaConditions.ForLoop;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}