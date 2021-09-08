package entities;

import javax.persistence.criteria.Order;
import java.util.Date;

public class OrderPairMain {

    public static void main(String[] args){
        Pair<String,Integer>  pair1 = new OrderPair<String, Integer>("Even",8);
        Pair<String,String>  pair2 = new OrderPair<String, String>("Hello","Generics");
        Pair<Integer,String>  pair3 = new OrderPair<Integer, String>(15,"Generics");
        Employee emp = new Employee(11,"FGH",new Date());
        Pair<Integer,Employee> pair4 = new OrderPair<Integer,Employee>(11,emp);


    }
}
