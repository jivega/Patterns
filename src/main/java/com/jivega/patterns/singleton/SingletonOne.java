package com.jivega.patterns.singleton;

public class SingletonOne {

	private static SingletonOne singletonOne;// = new SingletonOne();

	private static Integer numberOfInstances = 0;

	public static Integer getNumberOfInstances() {
		return numberOfInstances;
	}

	// Private constructor. To be called from this class
	private SingletonOne() {
		numberOfInstances++;
	}

	public static SingletonOne getInstance() throws InterruptedException {
		if (singletonOne == null) {
			Thread.sleep(10);
			singletonOne = new SingletonOne();
		}
		return singletonOne;
	}
}
