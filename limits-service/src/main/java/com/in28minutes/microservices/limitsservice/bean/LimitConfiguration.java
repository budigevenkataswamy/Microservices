package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {
	
	int maximum;
	int minimum;
	
	protected LimitConfiguration() {
	}
	public LimitConfiguration(int maximum, int minumum) {
		super();
		this.maximum = maximum;
		this.minimum = minumum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinumum() {
		return minimum;
	}
	public void setMinumum(int minumum) {
		this.minimum = minumum;
	}
	@Override
	public String toString() {
		return "LimitConfiguration [maximum=" + maximum + ", minumum=" + minimum + "]";
	}
	
	

}


