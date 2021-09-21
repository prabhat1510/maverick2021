package threadexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyRunnableExampleDemo {
    private static final int NTHREADS =10;
    public static void main(String[] args) {

        ExecutorService executor =  Executors.newFixedThreadPool(NTHREADS);
        for (int i = 0; i < 500; i++) {
            Runnable task = new MyRunnableExample(10000000L + i);
            executor.execute(task);
        }

        executor.shutdown();
        // Wait until all threads are finish
        try {
            executor.awaitTermination(5, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished all threads");

    }
}
