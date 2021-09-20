package threadexample;

public class HelloRunnableDemo {
    public static void main(String[] args) {
      Runnable runnable = new HelloRunnable() ;

      Thread t = new Thread(runnable);
      t.start();//it invokes run method implicitly
      System.out.println(t.isAlive());
      System.out.println(t.getName());
        System.out.println(t.getThreadGroup());
        System.out.println(t.getPriority());
        System.out.println(t.getId());
        System.out.println(t.isDaemon());
        System.out.println(t.isAlive());
        System.out.println(t.isInterrupted());

    }
}
