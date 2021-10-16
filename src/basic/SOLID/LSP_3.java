package src.basic.SOLID;

/**
 * The Liskov Substitution Principle (LSP) was introduced by Barbara Liskov.
 * It applies to inheritance in such a way that the derived classes must be completely substitutable
 * for their base classes. In other words, if class A is a subtype of class B, then we should be able to replace B
 * with A without interrupting the behavior of the program.
 */

public class LSP_3 {
    private double height;
    private double weight;

    public void setHeight(double h) {
        height = h;
    }

    public void setWeight(double w) {
        weight = w;
    }

}

class Pocket extends LSP_3 {

    public void setHeight(double h) {
//            super.setHeight();
    }

    public void setWeight(double h) {
//            super.setWeight();
    }

}