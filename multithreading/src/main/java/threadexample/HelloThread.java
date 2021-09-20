package threadexample;

public class HelloThread extends Thread{
    public HelloThread() {
        super();
        this.start();
    }

    public void run(){
        System.out.println("HelloThread run method is getting executed ----"+Thread.currentThread().getThreadGroup().getName());
        System.out.println("Inside HelloThread class run method");
    }
}
