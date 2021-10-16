package src.basic.JavaConditions.ForLoop;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class ForIfContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}