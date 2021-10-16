package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartAnd {

    public static void main(String[] args) {
        String text = "Mission: successful";
        Pattern pattern = Pattern.compile("^Mission: successful$"); // ^ - начало, $ - конец
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
