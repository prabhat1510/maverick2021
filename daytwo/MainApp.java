package training.daytwo.streams;

import training.methodref.DisplayInformation;
import training.methodref.Order;
import training.methodref.OrderAmount;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainApp{

    public static void main (String[] args){
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

        System.out.println("********************IntStream range method example*************");
        IntStream.range(1,10).forEach(System.out::println);

        Map<String, List<Order>> filteredOrders = orderList.stream().collect(Collectors.groupingBy(Order::getCurrency));
        System.out.println("********************GroupingBy example*************");
        //filteredOrders.forEach(System.out::println);

        System.out.println(filteredOrders);


    }
    }
