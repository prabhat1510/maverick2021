package training.daytwo.streams;

import training.methodref.DisplayInformation;
import training.methodref.Order;
import training.methodref.OrderAmount;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        System.out.println("********************GroupingBy example*************");
        Map<String, List<Order>> filteredOrders = orderList.stream().collect(Collectors.groupingBy(Order::getCurrency));
        //filteredOrders.forEach(System.out::println);
        System.out.println(filteredOrders);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> oddSquares =
                numbers.stream()
                        .filter(n->{
                            System.out.println("filtering " + n);
                            return n % 2 != 0;
                        })
                        .map(n->{
                            System.out.println("mapping " + n);
                            return n*n;
                        })
                        .limit(3)
                        .collect(Collectors.toList());

        System.out.println(oddSquares);


        Stream<String> currencies = Stream.of("AUD","USD","INR","EUR");
        currencies.collect(Collectors.toList()).forEach(System.out::println);

        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        IntStream intStream = Arrays.stream(nums);
        intStream.limit(4).forEach(System.out::println);
        //orderList.parallelStream().filter().forEach();
        Stream<Order> tradeStream = Stream.generate(()->{
            return createNextOrder();
        });

        System.out.println("*********************************************");
        tradeStream.limit(10).forEach(System.out::println);
    }


      static Order createNextOrder(){
          Order order = new Order("AUD",15000);
          return order;
      }
    }
