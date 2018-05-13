package com.pskindero.learning.design_patterns.builder.model.packing;

public class Wrapper implements Packing {

	public Wrapper() {
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
