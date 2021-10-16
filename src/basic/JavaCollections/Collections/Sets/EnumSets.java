package src.basic.JavaCollections.Collections.Sets;

import java.util.EnumSet;
import java.util.Set;

public class EnumSets {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Set<Season> seasonSet = EnumSet.allOf(Season.class);
        System.out.println(seasonSet);

    }
}
