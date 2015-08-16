package com.jivega.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
	@Test
	public void testOneInstanceSingletonOne() {
		Runnable run = new Runnable() {
			public void run() {
				try {
					Thread.sleep(500);
					for (int i = 0; i < 10; i++) {
						//Thread.sleep(0);
						SingletonOne singletonOne = SingletonOne.getInstance();
					}
				} catch (Exception e) {
					System.out.println(" interrupted");
				}
			}
		};
		for ( int i = 0 ; i < 1000 ; i++) {
			new Thread(run).start();
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Error in sleep");
		}
		Integer numberInstances = SingletonOne.getNumberOfInstances();
		Assert.assertEquals(Integer.valueOf(1), numberInstances);
	}
}
