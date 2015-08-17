package com.jivega.patterns.singleton;

public class SingletonWrong {
	private static SingletonWrong singletonWrong;
	private static Integer numberOfInstances = 0;

	public static Integer getNumberOfInstances() {
		return numberOfInstances;
	}

	// Private constructor. To be called from this class
	private SingletonWrong() {
		numberOfInstances++;
	}

	public static SingletonWrong getInstance() throws InterruptedException {
		if (singletonWrong == null) {
			Thread.sleep(10);
			singletonWrong = new SingletonWrong();
		}
		return singletonWrong;
	}
}
