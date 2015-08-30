package com.jivega.patterns.creational.prototype;

public class Manager extends PrototypeEmployee {

	public Manager() {
		position = "Manager";
	}
	public Manager clone() {
		return (Manager) super.clone();
	}

}
