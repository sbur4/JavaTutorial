package src.basic.JavaCollections.JavaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Developer {
    int id;
    String name = "";

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class DevComporator implements Comparator<Developer> {
    @Override
    public int compare(Developer o1, Developer o2) {
        return o1.name.compareTo(o2.name);
    }
}


public class ComparatorTest {
    public static void main(String[] args) {
        ArrayList<Developer> devList = new ArrayList<>();
        devList.add(new Developer(5, "Serg"));
        devList.add(new Developer(3, "Evgen"));
        devList.add(new Developer(7, "Misha"));
        devList.add(new Developer(8, "Evgen"));
        devList.add(new Developer(2, "Misha"));
        System.out.println(devList.toString());
        // 1 use funcional inteface
//        devList.sort((Comparator.comparingInt(o -> o.id)));
//        System.out.println(devList.toString());
//        devList.sort(Comparator.comparing(o -> o.name));
//        System.out.println(devList.toString());

        // 2 use class
//        devList.sort(new DevComporator());
//        System.out.println(devList.toString());

        //3 use col sor
        Collections.sort(devList, new DevComporator());
        System.out.println(devList.toString());
    }
}
