package threadexample.executor;

public class FirstWay {
    public static void main(String[] args) {
        System.out.println("Main thread starts here...");
        new FirstTask();
        System.out.println("Main thread end here...");
    }
}
