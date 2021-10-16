package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotABC {

    public static void main(String[] args) {
        String text = "dog";
        Pattern pattern = Pattern.compile("[^d]"); // [^] - только не те, которые в скобках
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
