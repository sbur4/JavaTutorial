package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RepetitionsNtimes {

    public static void main(String[] args) {
        String text = "wazzzup wazzzzzup";
        Pattern pattern = Pattern.compile("z{3,5}"); // {m,n} - повторения
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
