package src.basic.JavaSynchronization;

class Table3 {

    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {

        Thread t21 = new Thread() {
            public void run() {
                Table3.printTable(1);
            }
        };

        Thread t22 = new Thread() {
            public void run() {
                Table3.printTable(10);
            }
        };

        Thread t23 = new Thread() {
            public void run() {
                Table3.printTable(100);
            }
        };

        Thread t24 = new Thread() {
            public void run() {
                Table3.printTable(1000);
            }
        };
        t21.start();
        t22.start();
        t23.start();
        t24.start();
    }
}
