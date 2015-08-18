package com.jivega.patterns.singleton;

public class SingletonWrong {
	private static SingletonWrong singletonWrong;
	private static Integer numberOfInstances = 0;

	public static Integer getNumberOfInstances() {
		return numberOfInstances;
	}

	// Private constructor. To be called from this class
	private SingletonWrong() {
		System.out.println("Constructor");
		numberOfInstances++;
	}

	public static SingletonWrong getInstance() throws InterruptedException {
		if (singletonWrong == null) {
			System.out.println("Calling Constructor");
			singletonWrong = new SingletonWrong();
		}
		return singletonWrong;
	}
}
