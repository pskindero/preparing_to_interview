package com.pskindero.javainterview.javase.interfaces;

/**
 * Need to be remembered:
 * - methods are public and abstract by default, they cannot be protected or private
 * - from java 8: constants (static final) params, default and static methods
 * - from java 9: private methods in interfaces
 * - interface can be public and package-default
 * - interface is abstract by default
 * - can extends many interfaces (not implementing!) 
 */

public interface InterfaceGeneral extends I1, I2{

	//All of them are public final static by default!
	final int i = 0;
	static int s = 0;
	int ns = 0; 
	
	void doSome();
	
	default void doDef() {
		System.out.println("Default behaviour");
	}
	
	private void fromjava9() {}
	
	static void doStat() { //public by default
		
	}
}

interface I1 {}
interface I2 {}