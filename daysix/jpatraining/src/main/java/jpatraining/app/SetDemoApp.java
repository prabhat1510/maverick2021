package main.java.jpatraining.app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoApp {

    public static void main(String[] args){
        TreeSet<Person> personTreeSet = new TreeSet<>();
        HashSet<Person> personHashSet = new HashSet<>();
        Person p1 = new Person();
        p1.setPersonId(15);
        p1.setPersonName("Vasu");

        Person p2 = new Person();
        p2.setPersonId(5);
        p2.setPersonName("Abhijeet");


        Person p3 = new Person();
        p3.setPersonId(11);
        p3.setPersonName("Xavier");

        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p1);
        //Duplicates will be not added  only unique elements will added in TreeSet
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p1);
        //NullPointerException will throw if we try to add null value in TreeSet
        //personTreeSet.add(null);

/**
        personHashSet.add(p2);
        personHashSet.add(p1);
        personHashSet.add(p3);
        //Duplicate elements won't get added to HashSet
        personHashSet.add(p3);
        //one null value is allowed in HashSet
        ///personHashSet.add(null);
        personHashSet.add(null);
        System.out.print(personTreeSet);
        System.out.print(personHashSet);
**/

        System.out.print(personTreeSet);
        System.out.println("***********************");
        HashSet hashSet = new HashSet();
        Company company = new Company();
        company.setComId(11);
        company.setComName("Maveric");
        hashSet.add(company);
        hashSet.add("Cisco");
        System.out.println(hashSet);
        /**Iterator itr = hashSet.iterator();

        while(itr.hasNext()){
            //Object obj = itr.next();
            if(itr.next() instanceof  String){
                System.out.println( itr.next());
            }
           // System.out.println(itr.next());
        }
 **/

        System.out.println("****************************");
    for(Object set :hashSet){
        System.out.println(set.toString());
        System.out.println(set instanceof Company);
        System.out.println(set instanceof String);
        System.out.println("****************************");
        if(set instanceof Company){
            System.out.println(((Company) set).getComName());
            System.out.println(((Company) set).getComId());
        }


    }
    Company company1 = new Company();
    company1.setComId(15);
    company1.setComName("Amazon");
    hashSet.add(company1);
    System.out.println(hashSet.contains(company1));
        System.out.println(hashSet.contains(company));
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
    }
}
