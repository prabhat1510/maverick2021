package com.designpatterndemo.singleton;

public class MySingletonDemo {

    public static void main(String[] args){

       //System.out.println(MySingleton.getInstance());
        MySingleton instanceOne = MySingleton.getInstance();
        MySingleton isntanceTwo = MySingleton.getInstance();
        MySingleton instanceThree = MySingleton.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(isntanceTwo.hashCode());
        System.out.println(instanceThree.hashCode());


        if(instanceOne == isntanceTwo){
            System.out.println("Both instances are same ");
        }else if(isntanceTwo.equals(instanceOne)){
            System.out.println("Both instances are same using equals method");

        }else{
            System.out.println("Both instances are not same ");
        }
    }
}
