package src.basic.GOFdesignPatterns.StructuralPatterns.Decorator;

public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
