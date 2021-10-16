package src.basic.JavaInheritance;

/**
 * What Java does not allow is multiple inheritance where one class can inherit
 * properties from more than one class. It is known as the diamond problem.
 */

/**
 * @note The Solution of Diamond Problem
 */

interface DemoInterface1 {
    public default void display() {
        System.out.println("the display() method of DemoInterface1 invoked");
    }
}

interface DemoInterface2 {
    public default void display() {
        System.out.println("the display() method of DemoInterface2 invoked");
    }
}

public class DiamondProblem implements DemoInterface1, DemoInterface2 {
    public void display() {
        DemoInterface1.super.display();
        DemoInterface2.super.display();
    }

    public static void main(String args[]) {
        DiamondProblem obj = new  DiamondProblem();
        obj.display();
    }
}
