package com.jspiders.Spring.SpringScope;

public class Switch {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void turnOn() {
		System.out.println(getName()+" Turned On.");
	}
}
