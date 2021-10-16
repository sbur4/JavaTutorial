package src.basic.GOFdesignPatterns.BehavioralPatterns.ObserverPattern;

public interface Observer {

    /**
     * Наблюдатель — это поведенческий паттерн проектирования, который создаёт механизм подписки,
     * позволяющий одним объектам следить и реагировать на события, происходящие в других объектах.
     */

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}
