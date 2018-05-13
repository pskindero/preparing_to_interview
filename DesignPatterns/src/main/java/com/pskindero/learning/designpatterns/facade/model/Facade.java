package com.pskindero.learning.designpatterns.facade.model;

public class Facade {

	private Element1 e1;
	private Element2 e2;
	private Element3 e3;
	
	public Facade() {
		e1 = new Element1();
		e2 = new Element2();
		e3 = new Element3();
	}
	
	public void hideAllStepsAndShowForClientOnlyFacadeMethods() {
		e1.performAction();
		e2.performSomeOtherAction();
		e3.printResultOfActions();
	}
}
