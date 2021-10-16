package src.basic.JavaArray;

public class JavaArrayForWhile {
    public static void main(String[] args) {
        String[] cars = { "Chevrolet", "Mazda", "Citroen", "Ford", "Range Rover", "Huinday", "Porsche" };
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("\n");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\n");

        for (int i = 0; i < 2; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\n");

        for (int i = 0; i < 7; i++) {
            if (i == 5) {
                break;// continue;//
            }
            System.out.println(cars[i]);
        }
        System.out.println("\n");

        int i = 0;
        while (i < 7) {
            System.out.println(cars[i]);
            i++;
            if (i == 4) {
                break;
            }
        }
        System.out.println("\n");

        while (i < 7) {
            System.out.println(cars[i]);
            i++;
            if (i == 4) {
                continue;
            }
        }
        System.out.println("\n" + cars[0] + "\n");

        char[][] letterS = { { 'S', 'E', 'R', 'G' }, { 'M', 'A', 'R', 'Y' } };
        for (int a = 0; a < letterS.length; ++a) {
            for (int b = 0; b < letterS[a].length; ++b) {
                System.out.print(letterS[a][b]);
            }
        }
    }
}