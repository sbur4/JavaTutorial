package src.basic.JavaLambda;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {

        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов
    }
}
