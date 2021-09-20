package threadexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WorkerDemo {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();

        for(int i=0;i<5000;i++){
            listOfNumbers.add(new Random().nextInt());
        }
        /**
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);
        **/

        long start = System.currentTimeMillis();
        Worker worker = new Worker(listOfNumbers);
        Thread t = new Thread(worker);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken to sort:"+ (end-  start)+ " milliseconds");
        //System.out.println(myList);}}


    }
}
