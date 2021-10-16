package src.basic.JavaFunctionalInterfaces;

@FunctionalInterface
interface sayable {
    void say(String msg);
}

public class Main implements sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Main fie = new Main();
        fie.say("Hello there");
    }
}
