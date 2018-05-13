package com.pskindero.learning.design_patterns.builder.model.packing;

public class Bottle implements Packing{

	public Bottle() {
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
