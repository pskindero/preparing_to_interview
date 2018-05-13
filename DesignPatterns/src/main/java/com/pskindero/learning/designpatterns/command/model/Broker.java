package com.pskindero.design_patterns.command.model;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	List<Order> orders;
	
	public Broker() {
		this.orders = new ArrayList<Order>();
	}

	public void addOrder(Order o) {
		orders.add(o);
	}
	
	public void executeOrders() {
		for (Order order : orders) {
			order.execute();
		}
		orders.clear();
	}
}
