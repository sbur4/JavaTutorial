package src.basic.JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        list.add(7);
        list.add(1);
        System.out.println(list);

        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        System.out.println("~~~~~~~");
        list.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
        System.out.println("~~~~~~~");
        System.out.println(list.stream().max(Integer::compareTo).get());
        System.out.println("~~~~~~~");
        System.out.println(list.stream().min(Integer::compareTo).get());
        System.out.println("~~~~~~~");
        list.stream().forEach((i) -> {
            System.out.print(i + " ");
        });
        System.out.println();
        System.out.println("~~~~~~~");
        System.out.println(list.stream().allMatch(i -> i % 3 == 0));
        System.out.println("~~~~~~~");
        System.out.println(list.stream().filter(i -> i % 2 != 0).count());
        System.out.println("~~~~~~~");
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        System.out.println("~~~~~~~");
        System.out.println(list.stream().findAny());
        System.out.println("~~~~~~~");
        System.out.println(list.stream().findFirst());
        System.out.println("~~~~~~~");
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("~~~~~~~");
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("~~~~~~~");
//        list.stream().map();
//        list.stream().mapToInt();
//        list.stream().noneMatch();
//        list.stream().peek();
//        list.stream().reduce();
        //        System.out.println(list.stream().sorted());
//        list.stream().toArray();
//        list.stream().iterator();
//        list.stream().isParallel();

    }
}
