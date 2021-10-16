package src.basic.GOFdesignPatterns.BehavioralPatterns.MediatorPattern;

/**
 * Посредник — это поведенческий паттерн проектирования, который позволяет уменьшить
 * связанность множества классов между собой, благодаря перемещению этих связей в один класс-посредник.
 */

public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}
