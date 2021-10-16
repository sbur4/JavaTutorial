package src.basic.IO.Sytem;

import java.util.Scanner;

public class JavaSystemInOut {
    public static void main(String[] args) {

        Scanner newScn = new Scanner(System.in);
        System.out.println("Enter intger");
        int inScn = newScn.nextInt();
        System.out.println("Intger = " + inScn);
        newScn.close();
    }
}
