package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	private String name;

	public HelloWorldBean(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

	@Override
	public String toString() {
		return "HelloWorldBean [name=" + name + "]";
	}
	
	
	
	

}
