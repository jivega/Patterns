package com.jivega.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

	private final static String NAME = "John";
	private final static String SURNAME = "Gates";
	private final static String NATIONALITY = "USA";
	private final static String POSITION = "Manager";
	
	@Test
	public void employeeCreateTest(){
		Employee employee = new Employee.Builder().name(NAME).surname(SURNAME).nationality(NATIONALITY).position(POSITION).build();
		Assert.assertEquals(NAME, employee.getName());
		Assert.assertEquals(SURNAME, employee.getSurname());
		Assert.assertEquals(NATIONALITY, employee.getNationality());
		Assert.assertEquals(POSITION, employee.getPosition());
	}
}
