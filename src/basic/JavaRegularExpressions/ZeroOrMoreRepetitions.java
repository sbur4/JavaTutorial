package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroOrMoreRepetitions {

    public static void main(String[] args) {
        String text = "aabbbbcd";
        Pattern pattern = Pattern.compile("aa+b+c+d*"); // * - много или не одного повтореия,  + - одно или не одного повтореия
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
