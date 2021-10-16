package src.basic.JavaStrings;

public class StringMethods {
    public static void main(String[] args) {
        String start = "EPAM";
        System.out.println(start.charAt(0));
        System.out.println(start.charAt(1));
        System.out.println(start.compareTo("epam"));
        System.out.println(start.compareToIgnoreCase("epam"));
        System.out.println(start.concat(" java"));
        System.out.println(start.contains("PA"));
        System.out.println(start.endsWith("M") + "\t" + start.equals("epam") + "\t" + start.equalsIgnoreCase("epam"));
        System.out.println(String.format("%s", start));
        System.out.println(start.getBytes());
        //getChars;
        System.out.println(start.indexOf("P"));
        System.out.println(start.intern());//returns string from pool
        System.out.println(start.isEmpty());
        //lastIndexOf;
        System.out.println(start.length());
        System.out.println(start.replace('P','N'));
        System.out.println(start.replaceAll("N","P"));
        System.out.println(start.split("\\s"));
        System.out.println(start.startsWith("E"));
        System.out.println(start.substring(2,3));
        System.out.println(start.toLowerCase());
        System.out.println(start.toCharArray());
        System.out.println(start.trim());
        System.out.println(start.valueOf(start));
    }
}
