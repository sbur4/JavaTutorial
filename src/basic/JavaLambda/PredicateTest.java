package src.basic.JavaLambda;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false
    }
}
