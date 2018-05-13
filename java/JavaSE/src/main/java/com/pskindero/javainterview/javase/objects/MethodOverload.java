package com.pskindero.javainterview.javase.objects;

import java.util.Collection;

/**
 * Need to be remembered:
 * - overloading not working with Generics!
 */
public class MethodOverload {

	public static void main(String[] args) {

	}

	
	static void unknown(Collection c) {}
	//static void unknown(Collection<?> c) {} NOT POSSIBLE
}
