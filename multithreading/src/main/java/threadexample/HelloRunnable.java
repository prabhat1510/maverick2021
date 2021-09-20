package threadexample;

public class HelloRunnable implements Runnable{

    @Override
    public void run() {
        System.out.print("Inside run method of Hello Runnable");
    }
}
