package com.pskindero.javainterview.javase.objects.innerclasses;

/**
 * Need to be remembered:
 * - class can be only final or abstract, cannot be public or static
 * - has access to local members of outer class (if it is defined in non static block) and final or effective final members of enclosing block
 * - cannot contains non-final and final static member
 * - cannot contains static method
 */
public class LocalInnerClass {

	private int i = 0;
	private int j = 0;
	
	public static void main(String...strings) {
		
	}
	
	public void m(int param1, final int param2, int param3) {

		final int p = 0;
		param1  = 9;
		
		class Inner {
			
			public final static int FIS = 3;
			//public static int IS = 3; cannot  
			
			
			private int j = 2;
			
			public void m1() {
				i = 1;
				
				System.out.println(p);
				System.out.println(param2);
				System.out.println(param3);
				//System.out.println(param1); it is not final or effectively final
				
				LocalInnerClass.this.j = 7;
			}
			
//			cannot
//			public static void s() {
//				
//			}
		}
		
	}
}
