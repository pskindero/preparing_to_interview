package com.pskindero.learning.designpatterns.builder.model.packing;

public class Wrapper implements Packing {

	public Wrapper() {
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
