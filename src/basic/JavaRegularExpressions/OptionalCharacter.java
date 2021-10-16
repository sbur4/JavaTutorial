package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalCharacter {

    public static void main(String[] args) {
        String text = "1 file found? 2 files found?";
        Pattern pattern = Pattern.compile("\\d+ files? found?"); // ? - может быть может нет
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
