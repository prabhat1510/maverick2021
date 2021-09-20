package threadexample;

public class JoinDemo implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-- is isAlive example :----"+Thread.currentThread().isAlive());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new JoinDemo(),"MyJoinDemoThread");
        thread.start();
        //System.out.println(thread.getName()+"-- is isAlive :----"+thread.isAlive());

        try {
            thread.join();
            System.out.println(thread.getName()+"-- is isAlive :----"+thread.isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
