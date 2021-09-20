package threadexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Worker implements Runnable{

    List<Integer> listOfNumbers;
    //Parameterized constructor to initialize listOfNumbers
    public Worker(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    /**
     * definition of run method from Runnable Interface
     */
    @Override
    public void run() {
        Collections.sort(listOfNumbers);
    }
}
