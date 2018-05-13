package com.pskindero.learning.design_patterns.builder.model;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> mealElements = new ArrayList<Item>();
	
	public Meal() {
	}

	public void addItem(Item item) {
		this.mealElements.add(item);
	}
	
	public boolean removeItem(Item item) {
		return this.mealElements.remove(item);
	}
	
	public double getCost() {
		double totalCost = 0;
		for (Item item : this.mealElements) {
			totalCost += item.getPrize();
		}
		return totalCost;
	}
	
	public List<Item> getMealElements() {
		return this.mealElements;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meal");
		for (Item item : this.mealElements) {
			builder.append("\n-> ").append(item);
		}
		return builder.toString();
	}
}
