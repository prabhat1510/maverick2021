package training.methodref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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

        evaluate(orderList,o->System.out.println(o.getAmount()));
        evaluate(orderList,o->System.out.println(o.getCurrency()));
        System.out.println("***************Predicate Example*******************");
        List<Order> filterOrder= evaluatePredicate(orderList,o->o.getAmount() > 8000);
        System.out.println("**************Filtered Order greater than 8K********************");
        System.out.println(filterOrder);
        System.out.println("**********************************");
        List<Order> filterOrderTwo= evaluatePredicate(orderList,o->o.getAmount() < 11000);

        System.out.println("**************Filtered Order less than 11k********************");
        System.out.println(filterOrderTwo);
    }

    static void evaluate(List<Order> orders, Consumer<Order> consumer){
        for(Order order:orders){
            consumer.accept(order);
        }

    }

    static List evaluatePredicate(List<Order> orders, Predicate<Order> predicate){
        List<Order> filteredOrdered =  new ArrayList<Order>();
        for(Order order : orders){
            if(predicate.test(order)){
                System.out.println(order);
                filteredOrdered.add(order);
            }
        }
        return filteredOrdered;
    }
}
