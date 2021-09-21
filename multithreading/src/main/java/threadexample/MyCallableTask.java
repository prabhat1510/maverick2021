package threadexample;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallableTask implements Callable {
    @Override
    public Object call() throws Exception {

        /**
         * Different tasks can be performed . Like DB update,execute multiple algorithms etc.
         */
        //return "Data for user id x is updated successfully";
        //return new Random().nextInt();
        return 15;
    }

}
