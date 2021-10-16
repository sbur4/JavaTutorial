package src.basic.GOFdesignPatterns.CreationalPatterns.SingletonPatterns;

/**
 * Одиночка — это порождающий паттерн проектирования, который гарантирует,
 * что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.
 */

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    //private constructor to avoid client applications to use constructor
    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return instance;
    }
}
