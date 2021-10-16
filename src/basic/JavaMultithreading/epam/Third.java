package src.basic.JavaMultithreading.epam;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Third implements Callable<String> {

    @Override
    public String call() throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            System.out.println("Third " + i);
            sb.append("Call " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
