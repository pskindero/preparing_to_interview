package com.pskindero.learning.designpatterns.builder.model.packing;

public class Bottle implements Packing{

	public Bottle() {
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
