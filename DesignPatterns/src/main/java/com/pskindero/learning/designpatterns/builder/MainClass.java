package com.pskindero.learning.design_patterns.builder;

import com.pskindero.learning.design_patterns.builder.model.Meal;
import com.pskindero.learning.design_patterns.builder.model.MealBuilder;

/**
 * Example of Builder Design Pattern.
 */
public class MainClass {
    public static void main( String[] args ) {
    	MealBuilder builder = new MealBuilder();
    	Meal happyMeal = builder.prepareHappyMeal();
    	System.out.println(happyMeal);
    	System.out.println("Prize of meal: " + happyMeal.getCost());
    }
}
