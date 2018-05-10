package com.pskindero.javainterview.javase.basic.flow;

/**
 * Need to be remembered:
 * - only byte, short, int, char, String, enum and wrappers are allowed!
 * 
 */
public class Switch {

	public static void main(String[] args) {
		int i =3;
		switch (i) {
			case 1:
				System.out.println("1");
			case 3:
				System.out.println("3");
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
			default:
				System.out.println("def");
		
		}
	}
}
