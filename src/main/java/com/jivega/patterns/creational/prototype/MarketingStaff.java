package com.jivega.patterns.creational.prototype;

public class MarketingStaff extends PrototypeEmployee{

	public MarketingStaff() {
		position = "MarketingStaff";
	}
	public MarketingStaff clone() {
		return (MarketingStaff) super.clone();
	}
}
