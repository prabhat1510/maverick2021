package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericExample {

    public static void main(String[] args){

        //issues without generics
        List citites = new ArrayList();
        citites.add("Chennai"); // Element at Index poistion 0
        citites.add("Pune");// Element at Index poistion 1
        citites.add("Hyderabad"); // Element at Index poistion 2
        citites.add(2);
        citites.add(3.14);
        //citites.get(0) - first element of List which is represented by variable citites
        //citites.size() - result will be 3.
        //Index position of each element in a list will start from 0 to citites.size()-1

        System.out.println("Size of list citites---"+citites.size());
        System.out.println("Index of Hyderabad---"+citites.indexOf("Hyderabad"));
        System.out.println((citites.get(2) instanceof Object));
        Object city = citites.get(0);
        //System.out.println(city);
        System.out.println(citites.get(0));
        boolean flag = citites.get(0) instanceof Object;
        boolean flagString = citites.get(0) instanceof String;
        System.out.println("Is instance of String ----"+(citites.get(0) instanceof String )+"-------"+flag+"----------"+flagString);
        //System.out.println(city instanceof String);

        /**
        List<String> citites = new ArrayList<String>();
        citites.add("Chennai");
        citites.add("Pune");
        citites.add("Hyderabad");
        System.out.println((citites.get(0) instanceof Object));
        String city = citites.get(0);
        System.out.println(city instanceof String);
        //citites.add(12345);


        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1,"ABC",new Date()));
        employeeList.add(new Employee(2,"DEF",new Date()));
        System.out.println(employeeList.get(0) instanceof Employee);
        //System.out.println(employeeList.get(0) instanceof String);
        Employee emp = employeeList.get(0);

        Set<Employee> employeeSet = new HashSet<Employee>();
        employeeSet.add(new Employee(1,"ABC",new Date()));
        employeeSet.add(new Employee(1,"ABC",new Date()));
        employeeSet.add(new Employee(2,"DEF",new Date()));
        System.out.println(employeeSet.size());

        List<String> strings = new ArrayList<>() ;
        Pair<String,Integer> pairfour = new OrderPair<>("Even",8);
        System.out.println(sameAsKeyAndValue("Hello"));

        /**
         *
        //Type Wildcards with Inheritance is an issue
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(2);
        List<Number> nums = ints;  // Does not compile
        nums.add(3.14);
        Integer x=ints.get(1);
        **/
        //Wildcards can be uperbounded to constrain generic classes
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(2);
        List<? extends Number> nums = ints; // This is now OK
        System.out.println(nums instanceof Number);
        //nums.add(3.14);  // Does not compile as a Double can't be converted to an Integer
        //Integer x=ints.get(1);
        GenericExample ge = new GenericExample();
        //GenericExample.addNumbers( new ArrayList<Integer>() ) ;
        System.out.println(ge.addNumbers( new ArrayList<Integer>() ) );
        System.out.println(ge.addNumbers( new ArrayList<Number>() ) );
        System.out.println(ge.addNumbers( new ArrayList<Object>() ) );

    }


    public static <T> OrderPair<T,T> sameAsKeyAndValue(T value){
        return new OrderPair<T, T>(value,value);
    }

    public List addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        return list;
    }

}
