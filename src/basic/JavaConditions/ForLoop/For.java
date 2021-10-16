package src.basic.JavaConditions.ForLoop;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class For {
    public static void main(String[] args) {
        // for (statement 1; statement 2; statement 3) {
        // code block to be executed}

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        // for (type variableName : arrayName) {
        // code block to be executed}

        String[] broCars = { "Chevrolet", "Citroen", "Porsche" };
        for (String i : broCars) {
            System.out.println(i);
        }
    }
}