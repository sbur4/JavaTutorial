package src.basic.JavOptional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, " ", "Hello ", "EPAM");

        Stream<String> stream = list.stream();
        Optional<String> result = stream.findFirst();
        System.out.println(result.get());

        String s = "Hello World!";
        String nullString = null;
        Optional<String> optionalS1 = Optional.of(s); // Will work
        Optional<String> optionalS2 = Optional.ofNullable(s); // Will work too
        //ptional<String> optionalNull1 = Optional.of(nullString); // -> NullPointerException
        Optional<String> optionalNull2 = Optional.ofNullable(nullString); // Will work
        System.out.println(optionalS1.get()); // prints "Hello World!"
        //System.out.println(optionalNull2.get()); // -> NoSuchElementException
        if (!optionalNull2.isPresent()) {
            System.out.println("Is empty"); // Will be printed
        }
    }
}
