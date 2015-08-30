package com.jivega.patterns.creational.prototype;

public abstract class PrototypeEmployee implements Cloneable {

	private String name;
	private String surname;
	protected String position;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public PrototypeEmployee clone() {
		PrototypeEmployee clone = null;
		try {
			clone = (PrototypeEmployee) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
