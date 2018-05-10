package com.pskindero.javainterview.javase.objects.innerclasses;

/**
 * Need to be remembered:
 * - cannot have static member or method
 * - has access to members of outer class
 * - has access to final or effective final members of enclosing blocks
 */
public class AnnonymousClass {

	private int i = 0;
	private int j = 0;
	
	public static void main(String...strings) {
		
		final int fi = 0;
		
		AbstractClass a = new AbstractClass() {
			private int i = 2;
			
			private void m() {
				i =3;
				System.out.println(fi);
			}
			//private static int is = 3;
		};
	}

}

abstract class AbstractClass{}
