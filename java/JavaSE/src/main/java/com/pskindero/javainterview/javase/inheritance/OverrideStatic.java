package com.pskindero.javainterview.javase.inheritance;

/**
 * To be remembered:
 * 
 */
public class OverrideStatic {
	public static void main(String[] args) {
		I ib = new B();
		A ab = new B();
		B bb = new B();
		
		//Static types
		System.out.println("ib.SW = " + ib.SW); 
		System.out.println("ab.SW = " + ab.SW);
		System.out.println("bb.SW = " + bb.SW);
		
		System.out.println("I.getSW() =  " + I.getSW() + " ib.getSW() = no such method");
		System.out.println("A.getSW() =  " + A.getSW() + " ab.getSW() = " + ab.getSW());
		System.out.println("B.getSW() =  " + B.getSW() + " bb.getSW() = " + bb.getSW()); 
		
		System.out.println(A.S + " " + B.S);
	}
}

interface I {
	static int SW = 1;
	
	public static int getSW() {
		return SW;
	}
}

class A implements I {
	public static int SW = 2;
	public static int S = 1;
	
	public static int getSW() {
		return SW;
	}
}

class B extends A {
	public static int SW = 3;
	
	public static int getSW() {
		return SW;
	}
}