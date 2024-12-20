package com.springcore.ConsInjec;

public class Person {

	private String name;
	private int personId;
	private  Certificate certi;

	public Person(String name, int personId, Certificate certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name+" : "+this.personId +" : "+this.certi.name;
	}
	
}
