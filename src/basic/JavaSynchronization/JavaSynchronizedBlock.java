package src.basic.JavaSynchronization;

class Table1 {
    void printTable(int n) {
        synchronized (this) {//synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//end of the method
}

class MyThread11 extends Thread {
    Table1 t1;

    MyThread11(Table1 t1) {
        this.t1 = t1;
    }

    public void run() {
        t1.printTable(5);
    }

}

class MyThread12 extends Thread {
    Table1 t2;

    MyThread12(Table1 t2) {
        this.t2 = t2;
    }

    public void run() {
        t2.printTable(100);
    }
}

public class JavaSynchronizedBlock {
    public static void main(String args[]) {
        Table1 obj1 = new Table1();//only one object
        MyThread11 t11 = new MyThread11(obj1);
        MyThread12 t12 = new MyThread12(obj1);
        t11.start();
        t12.start();
    }
}
