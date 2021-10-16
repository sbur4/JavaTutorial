package src.basic.GOFdesignPatterns.BehavioralPatterns.CommandPattern;

/**
 * Команда — это поведенческий паттерн проектирования, который превращает запросы в объекты,
 * позволяя передавать их как аргументы при вызове методов, ставить запросы в очередь, логировать их, а также поддерживать отмену операций.
 */

public interface Command {
    void execute();
}
