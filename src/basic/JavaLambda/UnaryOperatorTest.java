package src.basic.JavaLambda;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // 25
    }
}
