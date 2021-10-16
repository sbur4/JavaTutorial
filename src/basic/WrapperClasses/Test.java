package src.basic.WrapperClasses;

public class Test {
    public static void main(String[] args) {
        int b = 55;
        Integer a = 33;
        System.out.println(a.byteValue());
        System.out.println(a.compareTo(22));
        System.out.println(a.compareTo(33));
        System.out.println(a.compareTo(44));
        System.out.println(a.hashCode());
        System.out.println(a.toString());
        System.out.println(a.doubleValue());
        System.out.println(a.equals(b));
        System.out.println(a.getClass());
    }
}
