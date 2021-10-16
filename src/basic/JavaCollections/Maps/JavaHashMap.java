package src.basic.JavaCollections.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Java HashMap contains values based on the key.
 * Java HashMap contains only unique keys.
 * Java HashMap may have one null key and multiple null values.
 * Java HashMap is non synchronized.
 * Java HashMap maintains no order.
 * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 */

public class JavaHashMap {
    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println("\n");

        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        capitalCities.clear();
        System.out.println(capitalCities);
        //
        capitalCities.put("A", "one");
        capitalCities.put("B", null);
        System.out.println(capitalCities.keySet());
        System.out.println(capitalCities.get("A"));
        System.out.println(capitalCities.get("B"));
        capitalCities.put("C", null);
        capitalCities.put("D", null);
        capitalCities.put(null, null);
        capitalCities.put(null, "two");
        System.out.println(capitalCities);
        System.out.println(capitalCities.toString());
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.isEmpty());
        System.out.println(capitalCities.values());
        System.out.println(capitalCities.keySet());
//        System.out.println(capitalCities.computeIfAbsent("D", "three"));
//        System.out.println(capitalCities.computeIfPresent());
        System.out.println(capitalCities.containsKey(null));
        System.out.println(capitalCities.containsValue(null));
        System.out.println(capitalCities.entrySet());
//        System.out.println(capitalCities.equals("A"));
//        System.out.println(capitalCities.getOrDefault());
//        System.out.println(capitalCities.merge());
//        System.out.println(capitalCities.putIfAbsent());
        capitalCities.remove("D");
        System.out.println(capitalCities.entrySet());
//        capitalCities.replace("C","four");
        System.out.println(capitalCities.entrySet());
//        System.out.println(capitalCities.forEach(k, v));
    }
}
