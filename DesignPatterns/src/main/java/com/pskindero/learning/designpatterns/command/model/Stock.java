package com.pskindero.design_patterns.command.model;

public class Stock {

	private String name;
	private int quantity;
	
	public Stock(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	public void buy() {
		System.out.println("Buy: " + name + ", quantity: " + quantity);
	}
	
	public void sell() {
		System.out.println("Sell: " + name + ", quantity: " + quantity);
	}
}
