package src.basic.JavaCollections.Maps;

import java.util.EnumMap;
import java.util.Map;

public class JavaEnumMap {
    public enum Days {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        Map<Days, String> map = new EnumMap<>(Days.class);
        map.put(Days.Monday, "1");
        map.put(Days.Tuesday, "2");
        map.put(Days.Wednesday, "3");
        map.put(Days.Thursday, "4");
        map.put(Days.Friday, "5");
        map.put(Days.Saturday, "6");
        map.put(Days.Sunday, "7");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
