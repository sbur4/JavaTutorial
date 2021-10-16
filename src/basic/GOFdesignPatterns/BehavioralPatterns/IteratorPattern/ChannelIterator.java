package src.basic.GOFdesignPatterns.BehavioralPatterns.IteratorPattern;

/**
 * Итератор — это поведенческий паттерн проектирования, который даёт возможность последовательно
 * обходить элементы составных объектов, не раскрывая их внутреннего представления.
 */

public interface ChannelIterator {

    public boolean hasNext();

    public Channel next();
}
