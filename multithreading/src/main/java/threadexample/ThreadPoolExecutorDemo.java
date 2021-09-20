package threadexample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {

        RejectedExecutionHandlerDemo rejectedExecutionHandlerDemo = new RejectedExecutionHandlerDemo();
        ThreadFactory tf=  Executors.defaultThreadFactory();
        ThreadPoolExecutor tpePool = new ThreadPoolExecutor(2,4,10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2),tf,rejectedExecutionHandlerDemo);
        Task task = new Task(tpePool,3);
        Thread t = new Thread(task);
        t.start();

        for(int i=0;i<10;i++){
            int j= i;
            tpePool.execute(()->System.out.println("Tasks executed ---"+j));

        }

        try {
            Thread.sleep(5000);
            //shutdown
            tpePool.shutdown();

            Thread.sleep(1000);
            task.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
