package com.pskindero.learning.designpatterns.builder.model.food;

import com.pskindero.learning.designpatterns.builder.model.Item;
import com.pskindero.learning.designpatterns.builder.model.packing.Packing;
import com.pskindero.learning.designpatterns.builder.model.packing.Wrapper;

public abstract class Burger implements Item {

	private String name;
	private Packing packingType;
	private double prize;
	
	public Burger(String name, double prize) {
		this.name = name;
		this.prize = prize;
		this.packingType = new Wrapper();
	}
	
	public String getName() {
		return name;
	}
	
	public Packing getPacking() {
		return this.packingType;
	}
	
	public double getPrize() {
		return this.prize;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Burger ");
		builder.append("\nName: ").append(name);
		builder.append("\nPacking: ").append(packingType);
		builder.append("\nPrize: ").append(prize);
		return builder.toString();
	}
	
	
}
