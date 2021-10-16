package src.basic.JavaMultithreading.epam;

import java.util.concurrent.TimeUnit;

public class First extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("First " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
