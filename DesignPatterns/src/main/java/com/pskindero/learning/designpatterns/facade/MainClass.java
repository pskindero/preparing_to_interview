package com.pskindero.learning.designpatterns.facade;

/**
 * Facade design pattern - structual pattern
 * 
 * Facade pattern hides the complexities of the system and provides 
 * an interface to the client using which the client can access the system. 
 * This type of design pattern comes under structural pattern as this 
 * pattern adds an interface to existing system to hide its complexities.
 */
public class MainClass {
	public static void main(String[] args) {
		Facade clientFacade = new Facade();
		clientFacade.hideAllStepsAndShowForClientOnlyFacadeMethods();
	}
}

class Facade {
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

class Element1 {
	public void performAction() {}
}

class Element2 {
	public void performSomeOtherAction() {}	
}

class Element3 {
	public void printResultOfActions() {}	
}
