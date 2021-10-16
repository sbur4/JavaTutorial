package src.basic.JavaCollections.Maps;

import java.util.Map;
import java.util.TreeMap;

/**
 * Java TreeMap contains values based on the key.
 * It implements the NavigableMap interface and extends AbstractMap class.
 * Java TreeMap contains only unique elements.
 * Java TreeMap cannot have a null key but can have multiple null values.
 * Java TreeMap is non synchronized.
 * Java TreeMap maintains ascending order.
 */

public class JavaTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> itSchool = new TreeMap<>();
        itSchool.put(5,"luxsoft");
//        itSchool.put(null,"skillup");
        itSchool.put(1,"epam");
        itSchool.put(3,"softserve");
        itSchool.put(2,"genesis");
        itSchool.put(4,"cicklum");
        itSchool.put(6,null);
        System.out.println(itSchool);
        System.out.println(itSchool.keySet());
        System.out.println(itSchool.values());
        System.out.println(itSchool.entrySet());
        System.out.println(itSchool.containsValue("epam"));
        System.out.println(itSchool.containsKey(1));
        System.out.println(itSchool.size());
    }
}
