package src.basic.GOFdesignPatterns.StructuralPatterns.Composite;

public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }

}
