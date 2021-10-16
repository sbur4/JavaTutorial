package src.basic.DataType.ReferenceType;

public class JavaString {

    public static void main(String[] args) {

        String hello = "Hello Serg";
        String secondHello = "Hello Serg";
        String thirdHello = "hELLO sERG";
        String fourthHello = "   hELLO sERG";
        String secondName = "Bur4";
        char[] catName = { 'B', 'O', 'S', 'T', 'O', 'N' };
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(hello + " \n");
        System.out.println("charAt 0: " + hello.charAt(0));// H
        System.out.println("codePointAt 1: " + txt.codePointAt(1));// B=66 in Unicode value
        System.out.println("codePointBefore 1: " + hello.codePointBefore(1));// H=72
        System.out.println("codePointCount: " + hello.codePointCount(0, 10));
        System.out.println("compareTo: " + hello.compareTo(secondHello));
        System.out.println("compareToIgnoreCase: " + hello.compareToIgnoreCase(thirdHello));
        System.out.println("concat: " + hello.concat(secondName));
        System.out.println("string + string: " + hello + secondName);
        System.out.println("contains: " + hello.contains("Hi") + "\t" + hello.contains("He"));
        System.out.println("contentEquals: " + hello.contentEquals("Hi") + "\t" + hello.contains("Hello Serg"));
        System.out.println("copyValueOf: " + String.copyValueOf(catName, 0, 6) + " \n");

        System.out.println("endsWith: " + hello.endsWith("Hi") + "\t" + hello.endsWith("rg"));
        System.out.println("equals: " + hello.equals(secondHello) + "\t" + hello.endsWith(thirdHello));
        System.out.println("equalsIgnoreCase: " + hello.equalsIgnoreCase(secondHello) + " \n");

        System.out.println("format: " + String.format("fu%sng good music", "CKI") + " \n");

        System.out.println("getBytes: " + hello.getBytes());
        String str = "No pain - no gain!";
        char[] charDst = new char[7];
        str.getChars(2, 9, charDst, 0);
        System.out.print("getChars: ");
        System.out.println(charDst);
        System.out.println("getBytes: " + hello.getClass() + " \n");

        System.out.println("hashCode: " + hello.hashCode() + " \n");

        System.out.println("indexOf: " + hello.indexOf("Serg"));
        System.out.println("intern: " + hello.intern());
        String emptyStr = "";
        System.out.println("isEmpty: " + hello.isEmpty() + "\t" + emptyStr.isEmpty() + " \n");

        System.out.println("lastIndexOf: " + str.lastIndexOf("gain"));
        System.out.println("length: " + txt.length() + "\n");

        System.out.println("matches: " + hello.matches("Hello Serg") + "\n");

        System.out.println("offsetByCodePoints: " + hello.offsetByCodePoints(1, 3) + "\n");

        System.out.println("regionMatches: " + hello.regionMatches(0, secondHello, 0, 10) + "\n");
        System.out.println("replace: " + hello.replace('o', 'p'));
        System.out.println("replaceFirst: " + hello.replaceFirst("Serg", "world"));
        System.out.println("replaceAll: " + hello.replaceAll("Hello", "Bur4") + "\n");

        // String[] tmp =
        // System.out.println("split: " + hello.split(" ", 2)); // ?
        System.out.println("startsWith: " + hello.startsWith("Hel"));
        System.out.println("subSequence: " + hello.subSequence(0, 3));
        System.out.println("substring: " + hello.substring(0, 3) + "\n");

        System.out.print("toCharArray: ");
        System.out.println(txt.toCharArray());
        System.out.println("toLowerCase: " + hello.toLowerCase());
        System.out.println("toString: " + hello.toString());
        System.out.println("toUpperCase: " + hello.toUpperCase());
        System.out.println("trim: " + fourthHello.trim() + "\n");

        System.out.println("valueOf: " + String.valueOf(catName) + "\n");

    }
}
