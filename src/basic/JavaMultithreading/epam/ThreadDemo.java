package src.basic.JavaMultithreading.epam;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
    public static void main(String[] args) {
        First first = new First();
        Thread second = new Thread(new Second());
        first.setPriority(Thread.MIN_PRIORITY);
        second.setPriority(Thread.MAX_PRIORITY);
        first.start();
        second.start();

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(new Third());
        try {
            String result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
