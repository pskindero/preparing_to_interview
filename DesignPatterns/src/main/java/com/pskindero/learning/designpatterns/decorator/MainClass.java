package com.pskindero.learning.designpatterns.decorator;

/**
 * DECORATOR
 * - Structural
 * 
 * Decorator allows to add a new functionality to existing class without
 * altering its structure. This pattern creates a decorator class which 
 * wraps the original class and provides additional functionality keeping 
 * class methods signature intact
 * 
 * Decorator vs class extension
 * 1. The Decorator pattern provides a more flexible way to add responsibilities 
 * to objects than can be had with static inheritance. With decorators, 
 * responsibilities can be added and removed at run-time simply by attaching and detaching them.
 * In contrast, inheritance requires creating a new class for each additional responsibility 
 * (e.g., BorderedScrollableTextView, BorderedTextView). This gives rise to many classes and 
 * increases the complexity of a system.
 * 2.Avoids feature-laden classes high up in the hierarchy. Decorator offers a pay-as-you-go 
 * approach to adding responsibilities. Instead of trying to support all foreseeable features 
 * in a complex, customizable class, you can define a simple class and add functionality incrementally 
 * with Decorator objects. Functionality can be composed from simple pieces. As a result, 
 * an application needn't pay for features it doesn't use. It's also easy to define new 
 * kinds of Decorators independently from the classes of objects they extend, even for unforeseen extensions.
 */
public class MainClass {

	public static void main(String[] args) {
		Common c = new ExistingImplDecorator(new ExistingImpl());
	}

}

interface Common {
	void print();
}

class ExistingImpl implements Common {
	public void print() {}
}


class ExistingImplDecorator implements Common {

	ExistingImpl existing;
	
	public ExistingImplDecorator(ExistingImpl e) { this.existing = e;}
	
	@Override 
	public void print() { 
		this.existing.print();
	}
	
	public void newMethod() {}
}