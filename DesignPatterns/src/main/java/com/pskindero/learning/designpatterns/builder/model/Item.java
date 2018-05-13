package com.pskindero.learning.design_patterns.builder.model;

import com.pskindero.learning.design_patterns.builder.model.packing.Packing;

public interface Item {

	String getName();
	
	Packing getPacking();
	
	double getPrize();
}
