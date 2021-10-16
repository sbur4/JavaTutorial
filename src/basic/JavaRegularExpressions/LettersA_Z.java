package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class LettersA_Z {

    public static void main(String[] args) {
        String text = "abcdefg";
        Pattern pattern = Pattern.compile("[a-z]");// [a-z] - буквы от а до я
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
