package src.basic.GOFdesignPatterns.BehavioralPatterns.StatePattern;

/**
 * Состояние — это поведенческий паттерн проектирования, который позволяет объектам менять
 * поведение в зависимости от своего состояния. Извне создаётся впечатление, что изменился класс объекта.
 */

public interface State {

    public void doAction();
}