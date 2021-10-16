package src.basic.GOFdesignPatterns.StructuralPatterns.Bridge;

public class Pentagon3 extends Shape3 {
    public Pentagon3(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
