package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class MatchesAOrB {

    public static void main(String[] args) {
        String text = "	I love cats I love dogs";
        Pattern pattern = Pattern.compile("I love (cats|dogs)"); // | - или
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        // System.out.println("\n");
    }
}
