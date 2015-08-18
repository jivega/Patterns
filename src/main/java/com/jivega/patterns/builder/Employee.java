package com.jivega.patterns.builder;

public class Employee {

	private final String name;
	private final String surname;
	private final String nationality;
	private final String position;

	private Employee(Builder builder) {
		this.name = builder.name;
		this.surname = builder.surname;
		this.nationality = builder.nationality;
		this.position = builder.position;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getNationality() {
		return nationality;
	}

	public String getPosition() {
		return position;
	}

	public static class Builder {

		private String name;
		private String surname;
		private String nationality;
		private String position;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder nationality(String nationality) {
			this.nationality = nationality;
			return this;
		}

		public Builder position(String position) {
			this.position = position;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

}