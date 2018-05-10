package com.pskindero.javainterview.javase.objects;

/**
 * Need to be remembered:
 * - all enums explicity extends java.lang.Enum, so they cannot extends other classes.
 * - equals, hashCode, clone are final
 * - Enum implements Serializable and Comparable
 * 
 */
public class Enum {

	public static void main(String[] args) {
		System.out.println(SimpleEnum.E1 instanceof I);
		System.out.println(SimpleEnum.E1 instanceof Object);
		System.out.println(SimpleEnum.E1 instanceof java.lang.Enum);
	}
	
	static enum SimpleEnum implements I {
		E1, E2;
		
		private int i = 0;
		private final int j = 0;
		public static int s = 3;
	}
	
	interface I {}
}


