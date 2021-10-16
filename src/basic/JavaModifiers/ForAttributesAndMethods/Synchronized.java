package src.basic.JavaModifiers.ForAttributesAndMethods;

public class Synchronized {

    // Modifier - synchronized
    // Description - Methods can only be accessed by one thread at a time

    private Object obj = new Object();

    public void doSomething() {

        // ...какая-то логика, доступная для всех потоков

        synchronized (obj) {

        // логика, которая одновременно доступна только для одного потока
        }
    }
}
