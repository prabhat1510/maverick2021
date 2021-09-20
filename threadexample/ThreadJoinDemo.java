package threadexample;

public class ThreadJoinDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(),"First");
        Thread t2 = new Thread(new MyRunnable(),"Second");
        Thread t3 = new Thread(new MyRunnable(),"Third");
        t1.start();
        //starts second thread after waiting for 10 seconds or if it's dead
        try{
            t1.join(10000);
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        t2.start();
        //starts third thread only when first thread is dead
        try{
            t1.join();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        t3.start();
        //let all threads finish execution before finishing main thread
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println("All threads are dead, exiting main thread");
    }
}
