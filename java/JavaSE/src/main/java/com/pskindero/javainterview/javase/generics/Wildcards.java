package com.pskindero.javainterview.javase.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Need to be remembered:
 * 
 */
public class Wildcards {

	public static void main(String[] args) {

		method(new II1() {});

		Collection<?> col = new ArrayList<String>();
		//col.add(new Object());
		
		unknown(new ArrayList<String>());
		unknown2(new ArrayList<String>());
	}

	static <T extends II1> void method(T t) {}
	//static <T super CC> void method(T t) {} not compile!
	

	static void unknown(Collection c) {
	
	}

	static void unknown2(Collection<?> c) {
		
	}
}

interface II1 {
}

interface II2 {
}

abstract class AC implements II1 {
}

class CC extends AC implements II2 {
}