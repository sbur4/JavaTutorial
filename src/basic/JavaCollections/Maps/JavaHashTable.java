package src.basic.JavaCollections.Maps;

import java.util.Hashtable;
import java.util.Map;

/**
 * A Hashtable is an array of a list. Each list is known as a bucket.
 * The position of the bucket is identified by calling the hashcode() method.
 * A Hashtable contains values based on the key.
 * Java Hashtable class contains unique elements.
 * Java Hashtable class doesn't allow null key or value.
 * Java Hashtable class is synchronized.
 * The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
 */

public class JavaHashTable {
    public static void main(String[] args) {
        Map<Character, String> engLevel = new Hashtable<>();
        engLevel.put('a',"A1");
        engLevel.put('b',"A2");
        engLevel.put('c',"B1");
        engLevel.put('d',"B2");
        engLevel.put('e',"C1");
        engLevel.put('f',"C2");
//        engLevel.put(null,null);
        System.out.println(engLevel);

    }
}
