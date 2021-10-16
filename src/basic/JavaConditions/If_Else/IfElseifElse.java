package src.basic.JavaConditions.If_Else;

public class IfElseifElse {
    public static void main(String[] args) {

        /*
         * if (condition1) { // block of code to be executed if condition1 is true }
         * else if (condition2) { // block of code to be executed if the condition1 is
         * false and condition2 is true } 
         * else { // block of code to be executed if the
         * condition1 is false and condition2 is false }
         */
        int a = 3;
        int b = 5;
        if (b < a) {
            System.out.println("is true");
        } else if (a > b) {
            System.out.println("is false");
        } else {
            System.out.println("is false");
        }
    }
}