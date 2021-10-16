package src.basic.JavaLambda;

import java.util.function.Predicate;

public class Pre {
    public static void main(String[] args) {
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate
        System.out.println(pr.test(10));    // Calling Predicate method
        // test
        System.out.println(pr.test(20));
        // and
        System.out.println(pr.test(10) && pr.test(20));
        System.out.println(pr.test(20) && pr.test(30));
    }
}
