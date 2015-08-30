package com.jivega.patterns.creational.prototype;

import com.jivega.patterns.creational.prototype.PrototypeFactory.ModelEmployee;

public class App {

	public static void main(String[] args) {
		
		//We create a new Manager obj
		try {
			Manager manager = (Manager) PrototypeFactory.getInstance(ModelEmployee.MANAGER);
			MarketingStaff marketingStaff = (MarketingStaff) PrototypeFactory.getInstance(ModelEmployee.MARKETINGSTAFF);
			System.out.println("Manager object is type " + manager.getPosition());
			System.out.println("MarketingStaff object is type " + marketingStaff.getPosition());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
