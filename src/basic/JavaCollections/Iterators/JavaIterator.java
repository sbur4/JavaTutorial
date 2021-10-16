package src.basic.JavaCollections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterator {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("England");
        countries.add("Sweden");
        countries.add("Denmark");
        countries.add("Norway");
        // Get the iterator
        Iterator<String> it = countries.iterator();
        // Print the first item
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}