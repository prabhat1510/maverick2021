package threadexample;

public class MyDisplayThread extends Thread{
    private Display display;
    private String name;

    public MyDisplayThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run(){
        display.wish(name);
    }
}
