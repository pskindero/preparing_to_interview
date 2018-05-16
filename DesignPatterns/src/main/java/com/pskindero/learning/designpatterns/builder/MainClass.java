package com.pskindero.learning.designpatterns.builder;

import com.pskindero.learning.designpatterns.builder.model.Meal;
import com.pskindero.learning.designpatterns.builder.model.MealBuilder;

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