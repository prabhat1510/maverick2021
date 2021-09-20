package threadexample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class SharedObject implements Runnable{
    private	static StringBuilder message=new StringBuilder("Welcome");
    @Override
    public void run() {
        int size = message.length();
        synchronized (this) {
            for (int i = 0; i < size; i++) {
                System.out.println(message.append('x'));
            }
        }
    }

    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();
        Thread t1 = new Thread(sharedObject);
        t1.start();
        Thread t2 = new Thread(sharedObject);
        t2.start();
        Thread t3 = new Thread(sharedObject);
        t3.start();
    }
}