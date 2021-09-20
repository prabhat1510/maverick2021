package threadexample;

public class Display {

    /**
     * Synchronzied methods use the monitor for the "this" object
     * static synchronized methods use the classes monitor
     * synchronized blocks must specify which object's monitor to lock or unlock and it can be nested
     *  synchronized(this){
     *
     *  }
     *
     *
     *
     * @param name
     */

    public synchronized void  wish(String name){
    //public void  wish(String name){
        /**
         * synchronized(current instance reference){}
        synchronized(this) {

        }**/
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello  "+name);

        }
        }

}
