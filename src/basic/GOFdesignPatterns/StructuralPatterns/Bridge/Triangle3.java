package src.basic.GOFdesignPatterns.StructuralPatterns.Bridge;

public class Triangle3 extends Shape3 {
    public Triangle3(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
