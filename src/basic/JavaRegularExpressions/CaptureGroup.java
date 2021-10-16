package src.basic.JavaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class CaptureGroup {

    public static void main(String[] args) {
        String text = "file_record_transcript.pdf  	file_07241999.pdf";
        Pattern pattern = Pattern.compile("^(file.+).pdf$"); // () 
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
