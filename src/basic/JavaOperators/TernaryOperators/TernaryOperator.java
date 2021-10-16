package src.basic.JavaOperators.TernaryOperators;

public class TernaryOperator {
    public static void main(String[] args) {
        // variable = Expression1 ? Expression2: Expression3
        int j, h;
        j = 10;
        h = (j == 1) ? 20 : 30;
        System.out.println("Значение b: " + h + "\n");

        h = (j == 10) ? 20 : 30;
        System.out.println("Значение b: " + h);
    }

}
