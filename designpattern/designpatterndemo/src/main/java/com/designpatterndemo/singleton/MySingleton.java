package com.designpatterndemo.singleton;
//Singleton class here is MySingleton
public class MySingleton {
    private static MySingleton instance = null;
    //private MySingleton instance = null;
    private MySingleton() {
    }

/**
    public static MySingleton getInstance(){
        if(instance == null) {
            synchronized(MySingleton.class) {
                if(instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
**/

    public static MySingleton getInstance() {
        if(instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }


/**
    public static MySingleton getInstance(){
        return new MySingleton();
    }
**/
}
