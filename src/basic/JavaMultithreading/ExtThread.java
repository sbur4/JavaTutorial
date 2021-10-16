package src.basic.JavaMultithreading;

public class ExtThread extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ExtThread t1 = new ExtThread();
        t1.start();
    }
}
