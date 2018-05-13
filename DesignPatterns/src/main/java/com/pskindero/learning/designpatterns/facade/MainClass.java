package com.pskindero.learning.designpatterns.facade;

import com.pskindero.learning.designpatterns.facade.model.Facade;

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
