package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnyCharacter {

    public static void main(String[] args) {
        String text = "abc123xyz+.!";
        Pattern pattern = Pattern.compile("\\."); // . - любые значения c точкой, \ - период \Any character (may or may not match terminator)
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
