package com.jivega.patterns.builder;

public class Employee {

	private final String name;
	private final String surname;
	private final String nationality;
	private final String position;
	public Employee(String name, final String surname, final String nationality,final String position) {
		this.name = name;
		this.surname = surname;
		this.nationality = nationality;
		this.position = position;
	}
}
