package src.basic.JavaCollections.Collections.Sets;

import java.util.HashSet;

/**
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * HashSet allows null value.
 * HashSet class is non synchronized.
 * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
 * HashSet is the best approach for search operations.
 * The initial default capacity of HashSet is 16, and the load factor is 0.75.
 */

public class HashSets {
    public static void main(String[] args) {

        HashSet<Integer> myNums = new HashSet<Integer>();
        myNums.add(7);
        myNums.add(1);
        myNums.add(5);
        myNums.add(3);
        myNums.add(null);
        System.out.println(myNums);
        System.out.println(myNums.contains(5));
        System.out.println(myNums.size());
        System.out.println("\n");

        for (Integer i : myNums) {
            System.out.println(i);
        }
        System.out.println("\n");

        for (int i = 0; i < myNums.size(); i++) {
            System.out.println(i);
        }
    }
}
