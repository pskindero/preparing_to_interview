package com.pskindero.javainterview.javase.generics;

/**
 * Need to be remembered:
 * - list of declared types must be after static and final keywords
 * - when method is used, the type can be left out and compiler will infer it
 * - when using method with type generic: Box<Integer> and Box<Double> are not subtypes of Box<Number>.
 */
public class GenericMethods {

	public static void main(String[] args) {

		GenericMethods.<Integer>m(1); //Integer
		//<Integer>m(1); // not compile
		
		
		GenericMethods gg = new GenericMethods("");
		gg.<Integer>m2(1);
		gg.m2(1);
		
		
		//Box<Integer> is not same as Box<Number>!!
		//m3(new Box<Integer>()); NOT COMPILE
	}
	
	public <Z> GenericMethods(Z z) {}

	static <G extends Number> void m(G g) {
		System.out.println(g.getClass());
	}
	
	final <G extends Number> void m2(G g) {
		System.out.println(g.getClass());
	}
	
	
	static void m3(Box<Number> b) {}
}

class Box<B extends Number> {}
