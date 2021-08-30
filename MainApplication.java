package training.methodref;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainApplication {

    public static void main (String[] args){
        //Side side;
        Order orderOne = new Order("AUD",15000);
        Order orderTwo = new Order("INR",5000);
        Order orderThree = new Order("USD",15000);
        Order orderFour = new Order("EUR",25000);
        Order orderFive = new Order("AUD",8000);
        Order orderSix = new Order("EUR",5000);

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(orderOne);
        orderList.add(orderTwo);
        orderList.add(orderThree);
        orderList.add(orderFour);
        orderList.add(orderFive);
        orderList.add(orderSix);
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

        System.out.println("*************Example of Function interface*********************");

        Function<List<Order>,Double> averageOrder = orderLists->{
          double total = 0.0;
          for(Order order: orderLists){
            total+=order.getAmount();
          }
          return total/orderLists.size();
        };

        System.out.println(averageOrder.apply(orderList));


        System.out.println("**********************Example of andThen and compose*********************");
        Function<Integer,Integer> addOne = x -> x+1;
        Function<Integer,Integer> multiplyByTwo = x -> x*2;

        Function<Integer,Integer> andThenExample = addOne.andThen(multiplyByTwo); // after
        Function<Integer,Integer> composeExample = addOne.compose(multiplyByTwo); //before

        System.out.println(andThenExample.apply(10));
        System.out.println(composeExample.apply(10));

        System.out.println("**********************Reverse sorting of order on the basis of amount*********************");
        //getAmount Method reference of Order is passed to Comparator comparing method.
        Collections.sort(orderList, Comparator.comparing(Order::getAmount).reversed());
        System.out.println(orderList);
        System.out.println("**********************Chaining of Comparators*********");
        Collections.sort(orderList, Comparator.comparing(Order::getAmount).thenComparing(Order::getCurrency));
        System.out.println(orderList);


        System.out.println("******************Stream Filter example********************");
        List<Order> orderList1 = new ArrayList<Order>();
        orderList1.add(orderOne);
        orderList1.add(orderTwo);
        orderList1.add(orderThree);
        orderList1.add(orderFour);
        orderList1.add(orderFive);
        orderList1.add(orderSix);
        orderList1.stream().filter(o->o.getAmount() >= 8000).forEach(System.out::println);
        System.out.println("*********limiting example******");
        orderList1.stream().filter(o->o.getAmount() > 10000).limit(2).forEach(System.out::println);
        System.out.println("********Skipping example*******");
        orderList1.stream().filter(o->o.getAmount() > 10000).skip(1).forEach(System.out::println);
        System.out.println("********Sorted example*******");
        //System.out.println(orderList1);
        orderList1.stream().filter(o->o.getAmount() >= 8000).sorted(Comparator.comparing(Order::getAmount)).forEach(System.out::println);
        System.out.println("********Map example*******");
        orderList1.stream().map(Order::getAmount).forEach(System.out::println);
        System.out.println("******************Use of Collector**************");
        List<Double> amountList = orderList1.stream().map(Order::getAmount).collect(Collectors.toList());
        System.out.println(amountList);
        System.out.println(amountList.size());

        Double result =orderList1.stream().filter(o->o.getAmount() > 10000).map(Order::getAmount).reduce(0.0,(a,b)->a+b);
        System.out.println(result);

        double sumOfOrderAmount = orderList1.stream().mapToDouble(Order::getAmount).sum();
        //double sumOfOrderAmount = orderList1.stream().mapToDouble(Order::getAmount).sum();
    }

    static void evaluate(List<Order> orders, Consumer<Order> consumer){

       /** for(Order order:orders){
            consumer.accept(order);
        }**/

        orders.forEach(consumer);

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
