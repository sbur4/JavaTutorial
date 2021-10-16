package src.basic.JavaCollections.Collections.Sets;

import java.util.TreeSet;

/**
 * Java TreeSet class contains unique elements only like HashSet.
 * Java TreeSet class access and retrieval times are quiet fast.
 * Java TreeSet class doesn't allow null element.
 * Java TreeSet class is non synchronized.
 * Java TreeSet class maintains ascending order.
 */

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> strSet = new TreeSet<>();
        strSet.add("abc");
        strSet.add("def");
        strSet.add("gh");
//        strSet.add(null);
        System.out.println(strSet);
        System.out.println(strSet.size());
        System.out.println(strSet.first());
        System.out.println(strSet.last());
        System.out.println(strSet.higher("def"));
        System.out.println(strSet.lower("def"));
    }
}
