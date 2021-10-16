package src.basic.JavaMultithreading;

public class ImpRunnable implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ImpRunnable m1 = new ImpRunnable();
        Thread t1 = new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }
}
