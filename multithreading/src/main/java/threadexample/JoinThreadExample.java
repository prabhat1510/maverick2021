package threadexample;

public class JoinThreadExample extends Thread{

    public void run(){

        for(int index=1;index<=10;index++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("index ----"+index);
        }
    }

    public static void main(String[] args) {
        JoinThreadExample jt1 = new JoinThreadExample();
        JoinThreadExample jt2 = new JoinThreadExample();
        JoinThreadExample jt3 = new JoinThreadExample();
        //jt1.notify();
        jt1.start();

        try {
            jt1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        jt2.start();
        jt3.start();
    }
}
