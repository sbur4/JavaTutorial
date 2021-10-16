package src.basic.JavaCollections.JavaComparable;

import java.util.HashMap;
import java.util.Map;

class Developer implements Comparable<Developer> {
    int id;
    String name = "";

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Developer o) {
        int result = id - o.id;
        int value = 0;
        if (result > 0) {
            value = 1;
        }
        if (result < 0) {
            value = -1;
        } else {
            value = 0;
        }
        return value;
    }
}

public class ComparableTest {
    public static void main(String[] args) {
        Map<Integer, String> devList = new HashMap<>();
        devList.put(5, "Serg");
        devList.put(3, "Evgen");
        devList.put(7, "Misha");
        System.out.println(devList);
    }
}
