package src.basic.JavaConditions.ForLoop;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class ForIfBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}