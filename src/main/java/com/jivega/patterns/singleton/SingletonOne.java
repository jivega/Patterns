package com.jivega.patterns.singleton;

public class SingletonOne {
	private static SingletonOne singletonOne;
	private static Integer numberOfInstances = 0;

	public static Integer getNumberOfInstances() {
		return numberOfInstances;
	}
	private SingletonOne(){
		numberOfInstances++;
	}
	public static synchronized SingletonOne getInstance() throws InterruptedException {
		if (singletonOne == null) {
			Thread.sleep(10);
			singletonOne = new SingletonOne();
		}
		return singletonOne;
	}
}
