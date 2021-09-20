package threadexample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(()->System.out.println("Hello World"));

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(()->System.out.println("Good Evening"));
        //Executor will be closed
        executorService.shutdown();

    }
}
