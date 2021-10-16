package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnyWhitespace {

    public static void main(String[] args) {
        String text = "          abc";
        Pattern pattern = Pattern.compile("\\s");// \s - пробелы
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
