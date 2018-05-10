package com.pskindero.javainterview.javase.objects.innerclasses;

/**
 * Need to be remembered:
 * - initialization:
		NonStaticInnerClass o = new NonStaticInnerClass();
		NonStaticInnerClass.Inner in = o.new Inner();
 * - has access to local (also private) members of outer class
 * - shadowing: NonStaticInnerClass.this.i = 1;
 * - cannot contains non-final static member
 * - cannot contains static method
 */
public class NonStaticInnerClass {

	private int i = 0;
	private int j = 0;
	
	public static void main(String...strings) {
		NonStaticInnerClass o = new NonStaticInnerClass();
		NonStaticInnerClass.Inner in = o.new Inner();
	}
	
	public class Inner {
		
		public final static int FIS = 3;
		//public static int IS = 3; Cannot 
		
		
		private int j = 2;
		
		public void m1() {
			i = 1;
			
			//Shadowing
			j = 2;
			NonStaticInnerClass.this.j=3;
		}
		
//		Cannot
//		public static void s() {
//			
//		}
	}
}
