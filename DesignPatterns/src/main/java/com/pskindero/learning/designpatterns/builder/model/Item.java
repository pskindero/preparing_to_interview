package com.pskindero.learning.designpatterns.builder.model;

import com.pskindero.learning.designpatterns.builder.model.packing.Packing;

public interface Item {

	String getName();
	
	Packing getPacking();
	
	double getPrize();
}
