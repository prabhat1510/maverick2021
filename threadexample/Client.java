package threadexample;

import java.util.concurrent.locks.Lock;

public class Client {
    public static void main(String[] args) {

        Display display = new Display();
        MyDisplayThread myDisplayThread1 = new MyDisplayThread(display,"Dhoni");
        MyDisplayThread myDisplayThread2 = new MyDisplayThread(display,"Kohli");
        myDisplayThread1.start();
        myDisplayThread2.start();

    }
}
