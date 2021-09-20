package threadexample;

public class HelloThreadDemo {

    public static void main(String[] args) {

        Thread t = new HelloThread();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println("************************");
        System.out.println(t.ge);
        System.out.println(t.getName());
        System.out.println(t.getThreadGroup());
        System.out.println(t.getPriority());
        System.out.println(t.getId());
        System.out.println(t.isDaemon());
        System.out.println(t.isAlive());
        System.out.println(t.isInterrupted());

    }
}
