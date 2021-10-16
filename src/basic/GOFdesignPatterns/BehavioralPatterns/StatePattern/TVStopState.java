package src.basic.GOFdesignPatterns.BehavioralPatterns.StatePattern;

public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
