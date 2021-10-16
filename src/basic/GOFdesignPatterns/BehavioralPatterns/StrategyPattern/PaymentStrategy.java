package src.basic.GOFdesignPatterns.BehavioralPatterns.StrategyPattern;

/**
 * Стратегия — это поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов и помещает
 * каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.
 */

public interface PaymentStrategy {
    public void pay(int amount);
}
