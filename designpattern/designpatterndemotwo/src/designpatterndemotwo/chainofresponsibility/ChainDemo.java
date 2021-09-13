package designpatterndemotwo.chainofresponsibility;

public class ChainDemo {

    public static void main(String [] args){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"Information");
        loggerChain.logMessage(AbstractLogger.ERROR,"Error Information");
        loggerChain.logMessage(AbstractLogger.DEBUG,"Debug Information");

    }

    static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
