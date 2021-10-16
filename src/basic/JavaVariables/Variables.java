package src.basic.JavaVariables;
/**
 * There are three types of variables in Java: local variable, instance
 * variable, static variable.
 * 
 */
public class Variables {

    // Instance Variable
    /*
     * A variable declared inside the class but outside the body of the method, is
     * called instance variable. It is not declared as static. It is called instance
     * variable because its value is instance specific and is not shared among
     * instances.
     */
    char my1 = 'c';

    // Static variable
    /*
     * A variable which is declared as static is called static variable. It cannot
     * be local. You can create a single copy of static variable and share among all
     * the instances of the class. Memory allocation for static variable happens
     * only once when the class is loaded in the memory.
     */
    static int my2 = 3;

    public static void main(String[] args) {

        // Local Variable
        /*
         * A variable declared inside the body of the method is called local variable.
         * You can use this variable only within that method and the other methods in
         * the class aren't even aware that the variable exists.
         */
        String my3 = "QQ";

        //System.out.println(my1);
        System.out.println(my2);
        System.out.println(my3);
    }
}