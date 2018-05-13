package com.pskindero.learning.design_patterns.builder.model;

import com.pskindero.learning.design_patterns.builder.model.drink.Coke;
import com.pskindero.learning.design_patterns.builder.model.drink.Pepsi;
import com.pskindero.learning.design_patterns.builder.model.food.ChickenBurger;
import com.pskindero.learning.design_patterns.builder.model.food.VegBurger;

public class MealBuilder {

	public MealBuilder() {
	}

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareHappyMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
