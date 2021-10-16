package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class Digits123 {

    public static void main(String[] args) {
        String text = "abc123xyz";
        Pattern pattern = Pattern.compile("123"); // любые цифры
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
