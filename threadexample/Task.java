package threadexample;

import java.util.concurrent.ThreadPoolExecutor;

public class Task implements Runnable{

    private ThreadPoolExecutor tpe;
    private int delay;
    private boolean run= true;

    public Task(ThreadPoolExecutor tpe, int delay) {
        this.tpe = tpe;
        this.delay = delay;

    }

    @Override
    public void run() {

        while(run){
            System.out.println(this.tpe.getPoolSize());
            System.out.println(this.tpe.getActiveCount());
            System.out.println(this.tpe.getCorePoolSize());
            System.out.println(this.tpe.getTaskCount());
            System.out.println(this.tpe.getCompletedTaskCount());
            System.out.println(this.tpe.isShutdown());
            System.out.println(this.tpe.isTerminated());

            try {
                Thread.sleep(this.delay*2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public void shutdown(){
        this.run =false;
    }
}
