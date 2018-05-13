package com.pskindero.learning.designpatterns.servicelocator.model;

public class Service1 implements Service{

	public void performAction() {
		System.out.println("Service action 1");
	}

	public String getName() {
		return "Service1";
	}

}
