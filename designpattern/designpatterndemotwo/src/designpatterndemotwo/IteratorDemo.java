package designpatterndemotwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args){
    List<Integer> listOfInteger = new ArrayList<>();

    listOfInteger.add(10);
    listOfInteger.add(15);
        listOfInteger.add(11);
        listOfInteger.add(18);
        listOfInteger.add(210);
        listOfInteger.add(215);

        Iterator itr = listOfInteger.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
