package com.jivega.patterns.creational.prototype;

import org.junit.Assert;
import org.junit.Test;

import com.jivega.patterns.creational.prototype.PrototypeFactory.ModelEmployee;

public class PrototypeTest {
	@Test
	public void MarkeingStaffCreateTest() throws CloneNotSupportedException{
		Manager manager = (Manager) PrototypeFactory.getInstance(ModelEmployee.MANAGER).clone();
		MarketingStaff marketingStaff = (MarketingStaff) PrototypeFactory.getInstance(ModelEmployee.MARKETINGSTAFF).clone();
		Assert.assertEquals(manager.getPosition(),ModelEmployee.MANAGER);
		Assert.assertEquals(marketingStaff.getPosition(),ModelEmployee.MARKETINGSTAFF);
	}
}
