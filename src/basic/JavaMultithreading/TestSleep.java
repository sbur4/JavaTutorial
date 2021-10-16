package src.basic.JavaMultithreading;

public class TestSleep extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        TestSleep t1 = new TestSleep();
        TestSleep t2 = new TestSleep();

        t1.start();
        t2.start();
    }
}
