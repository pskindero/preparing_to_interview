package com.pskindero.learning.designpatterns.builder.model.drink;

import com.pskindero.learning.designpatterns.builder.model.Item;
import com.pskindero.learning.designpatterns.builder.model.packing.Bottle;
import com.pskindero.learning.designpatterns.builder.model.packing.Packing;

public abstract class ColdDrink implements Item {

	private String name;
	private Packing packingType;
	private double prize;
	
	public ColdDrink(String name, double prize) {
		super();
		this.name = name;
		this.prize = prize;
		this.packingType = new Bottle();
	}

	public String getName() {
		return name;
	}

	public Packing getPacking() {
		return packingType;
	}

	public double getPrize() {
		return prize;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ColdDrink");
		builder.append("\nName: ").append(name);
		builder.append("\nPacking: ").append(packingType);
		builder.append("\nPrize: ").append(prize);
		return builder.toString();
	}
}
