package src.basic.GOFdesignPatterns.CreationalPatterns.AbstractFactoryPattern;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
