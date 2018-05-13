package com.pskindero.learning.designpatterns.servicelocator.model;

public class InitialContext {

	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("service1")) {
			System.out.println("Looking up for Service1");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("service2")) {
			System.out.println("Looking up for Service2"); 
			return new Service2();
		} else {
			return null;
		}
	}
}
