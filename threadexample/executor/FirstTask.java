package threadexample.executor;

import java.util.concurrent.TimeUnit;

public class FirstTask extends Thread{
    public FirstTask() {
        this.start();
    }

    @Override
    public void run() {
        for(int i=10;i>0;i--){
            System.out.println("TICK TICK"+i);
            /**
             * Use of sleep method
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }**/
        }
    }
}
