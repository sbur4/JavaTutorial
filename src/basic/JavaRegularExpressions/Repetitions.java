package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Repetitions {

    public static void main(String[] args) {
        String text = "wazzzzzup";
        Pattern pattern = Pattern.compile("z{5}"); // {m} - повторения
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
