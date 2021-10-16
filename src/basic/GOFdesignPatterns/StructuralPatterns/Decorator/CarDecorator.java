package src.basic.GOFdesignPatterns.StructuralPatterns.Decorator;

/**
 * Декоратор — это структурный паттерн проектирования, который позволяет динамически добавлять
 * объектам новую функциональность, оборачивая их в полезные «обёртки».
 */

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}
