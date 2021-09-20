package threadexample;

public class ThreadLifeCycleDemo extends  Thread{

    public void run(){
        System.out.println("Insdie run() Thread is alive or not" +this.isAlive()+"----"+Thread.currentThread().getState());
        int num=0;
        while(num<4){
            num++;
            System.out.println("num= "+num);
            try{
                sleep(500);
            }catch (InterruptedException ie){
                System.out.println("Thread Interrupted....");
            }

        }
    }

    public static void main(String[] args) {
        Thread myThread = new ThreadLifeCycleDemo();
        System.out.println("Before Runnable stage Thread is alive or not:"+myThread.isAlive());

        System.out.println("Before start method call ---"+myThread.getState());
        myThread.start();
        System.out.println("After start method call ---"+myThread.getState());


        try{
            myThread.join();
            System.out.println("Before sleep method call ---"+myThread.getState());
            System.out.println("Before sleep method call is thread alive---"+myThread.isAlive());
            myThread.sleep(4000);

        }catch (InterruptedException ie ){
            System.out.println("Thread is Interrupted!");
        }
        //myThread.stop();
        System.out.println(myThread.getState());
        System.out.println("After complete execution of Thread, it is alive or not "+myThread.isAlive());
    }
}
