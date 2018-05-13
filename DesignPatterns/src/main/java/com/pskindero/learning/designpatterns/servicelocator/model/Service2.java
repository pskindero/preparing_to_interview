package com.pskindero.learning.designpatterns.servicelocator.model;

public class Service2 implements Service{

	public void performAction() {
		System.out.println("Service action 2");
	}

	public String getName() {
		return "Service2";
	}

}
