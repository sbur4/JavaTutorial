package src.basic.GOFdesignPatterns.StructuralPatterns.Composite;

/**
 * Компоновщик — это структурный паттерн проектирования, который позволяет сгруппировать
 * множество объектов в древовидную структуру, а затем работать с ней так, как будто это единичный объект.
 */

public interface Shape {
    public void draw(String fillColor);
}
