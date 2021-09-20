package threadexample;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside my runnable run()"+Thread.currentThread().getName());
    }
}
