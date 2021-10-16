package src.basic.JavaStrings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ConcatenationStrings {
    public static void main(String[] args) {
        String s10 = "A";
        String s11 = "B";
        String s12 = "C";
        String str1 = s10 + s11 + s12;
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder();
        str2.append(s10);
        str2.append(s11);
        str2.append(s12);
        System.out.println(str2);

        String str3 = String.join("", s10, s11, s12);
        System.out.println(str3);

        String str4 = s10.concat(s11).concat(s12);
        System.out.println(str4);

        String str5 = String.format("%s%s%s",s10,s11,s12);
        System.out.println(str5.toString());

        StringJoiner str6 = new StringJoiner("");
        str6.add("A");
        str6.add("B");
        str6.add("C");
        System.out.println(str6.toString());

        List<String> liststr = Arrays.asList("A", "B", "C");
        String str7 = liststr.stream().collect(Collectors.joining(""));
        System.out.println(str7.toString());
    }
}
