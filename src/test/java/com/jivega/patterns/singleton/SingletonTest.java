package com.jivega.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
	@Test
    public void testOneInstanceSingleton()
    {
		Runnable run = new Runnable() {
			public void run() {
		        try {
		            for (int i = 0; i < 200; i++) {
		                Thread.sleep(1);
		    			SingletonOne singletonOne = SingletonOne.getInstance();
		                //System.out.print(i + "\n" + "...");
		            }
		        } catch (Exception e) {
		            System.out.println(" interrupted");
		        }
		    }
		};
		 new Thread(run).start();
		 new Thread(run).start();
		 new Thread(run).start();
		 new Thread(run).start();
		 try{
			 Thread.sleep(1000);	 
		 } catch (Exception e) {
			 System.out.println("Error in sleep");
		 }
		 
		Integer numberInstances = SingletonOne.getNumberOfInstances();
		
        Assert.assertEquals( Integer.valueOf(1), numberInstances);
    }
}
