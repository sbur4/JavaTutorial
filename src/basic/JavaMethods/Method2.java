package src.basic.JavaMethods;

public class Method2 {

    static void myMethod2(String fname) {
        System.out.println(fname);
    }

    static void myMethod21(String laptopName, int price) {
        System.out.println(laptopName + " " + "$" + price);
    }

    public static void main(String[] args) {
        myMethod2("Kate");
        myMethod2("Cristina");
        myMethod21("MateBook X Pro", 1400);
        myMethod21("HP Spectre x360", 899);
        myMethod21("Dell XPS 15", 1729);

    }
}