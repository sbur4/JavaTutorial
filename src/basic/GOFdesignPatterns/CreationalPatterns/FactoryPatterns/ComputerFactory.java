package src.basic.GOFdesignPatterns.CreationalPatterns.FactoryPatterns;

/**
 * Фабричный метод — это порождающий паттерн проектирования, который определяет общий интерфейс
 * для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
 */

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
