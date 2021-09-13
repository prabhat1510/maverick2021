package designpatterndemotwo.chainofresponsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;



    protected int level;

    protected  AbstractLogger nextLogger;

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

  public void logMessage(int level, String msg){
        if(this.level <= level){
            write(msg);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,msg);
        }
  }

  abstract protected  void write(String message);
}
