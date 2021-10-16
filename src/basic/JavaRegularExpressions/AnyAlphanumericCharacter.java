package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnyAlphanumericCharacter {

    public static void main(String[] args) {
        String text = "abc123xyz+.!";
        Pattern pattern = Pattern.compile("\\w"); // \w - любые буквенные значения \Any word character, short for [a-zA-Z_0-9]
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
