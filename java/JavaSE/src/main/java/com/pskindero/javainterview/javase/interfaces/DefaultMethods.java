package com.pskindero.javainterview.javase.interfaces;

/**
 * Need to be remembered:
 * - abstract class that implements interface can define default method as abstract!
 */
public interface DefaultMethods {
	default void doSome() {
		System.out.println("OK");
	}
	
	default void doSome2() {
		System.out.println("2OK");
	}
}

abstract class C implements DefaultMethods {
	public void doSome() {	//Must be public, cannot reduce visibility!
		System.out.println("OK2");
	}
	public abstract void doSome2(); 
}

class CC extends C {
	public void doSome2() {}
}
