package src.basic.JavaMethods;

public class ReturnValues {
    static int myMethod3(int iks) {
        return 5 + iks;
    }

    static int myMethod31(int igrik, int zet) {
        return igrik + zet;
    }

    public static void main(String[] args) {
        System.out.println(myMethod3(3));
        System.out.println(myMethod31(1, 7));

        System.out.println("\n");

        int cc = myMethod31(2, 4);
        System.out.println(cc);
    }
}
