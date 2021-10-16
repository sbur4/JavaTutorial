package src.basic.GOFdesignPatterns.CreationalPatterns.AbstractFactoryPattern;

/**
 * Абстрактная фабрика — это порождающий паттерн проектирования, который позволяет создавать семейства
 * связанных объектов, не привязываясь к конкретным классам создаваемых объектов.
 */

public interface ComputerAbstractFactory {
    Computer createComputer();
}
