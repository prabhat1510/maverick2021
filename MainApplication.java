package training.methodref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApplication {

    public static void main (String[] args){
        //Side side;
        Order orderOne = new Order("AUD",15000);
        Order orderTwo = new Order("AUD",5000);
        Order orderThree = new Order("AUD",11000);
        Order orderFour = new Order("AUD",25000);
        Order orderFive = new Order("AUD",8000);

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
       //Static Method Reference Example
       DisplayInformation display = Order::displayCurrency;
       display.display();


       //Reference to instance method
        DisplayInformation displayInfo = orderOne::displayAmount;
        displayInfo.display();

        //Reference to constructor
        OrderAmount orderAmount = Order::new;
        orderAmount.getOrderAmount(51000);

    }
}
