package training.methodref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApplication {

    public static void main (String[] args){
        Side side;
        Order orderOne = new Order("AUD",15000,null);
        Order orderTwo = new Order("AUD",5000,null);
        Order orderThree = new Order("AUD",11000,null);
        Order orderFour = new Order("AUD",25000,null);
        Order orderFive = new Order("AUD",8000,null);

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(orderOne);
        orderList.add(orderTwo);
        orderList.add(orderThree);
        orderList.add(orderFour);
        orderList.add(orderFive);
       //getAmount Method reference of Order is passed to Comparator comparing method.
       Collections.sort(orderList, Comparator.comparing(Order::getAmount));

       System.out.println(orderList.toString());
       orderList.forEach(order->System.out.println(order.getAmount()));

    }
}
