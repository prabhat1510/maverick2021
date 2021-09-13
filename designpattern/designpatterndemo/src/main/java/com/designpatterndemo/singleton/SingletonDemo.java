package com.designpatterndemo.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime singletonRuntime = Runtime.getRuntime();

		singletonRuntime.gc();
		System.out.println(singletonRuntime);
		System.out.println(singletonRuntime.maxMemory());
		System.out.println(singletonRuntime.freeMemory());
		System.out.println(singletonRuntime.totalMemory());

		Runtime anotherInstance = Runtime.getRuntime();
		
		System.out.println(anotherInstance);
		System.out.println(anotherInstance.maxMemory());
		System.out.println(anotherInstance.freeMemory());
		System.out.println(anotherInstance.totalMemory());
		
		if(singletonRuntime == anotherInstance) {
			System.out.println("They are the same instance");
		}

	}

}
